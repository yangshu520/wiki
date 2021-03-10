import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

//axios映入并配置
import axios from 'axios'
axios.defaults.baseURL=process.env.VUE_APP_SERVER;

//axios拦截器
axios.interceptors.request.use(function (config){
    console.log("请求参数：",config)
    return config
});

//响应拦截
axios.interceptors.response.use(function (response){
    console.log("响应参数：",response)
    return response
},error => {
    console.log("错误参数：",error);
    return Promise.reject(error)
})

//集成ant degin vue
import Antd from 'ant-design-vue';
import 'ant-design-vue/dist/antd.css';

//ant degin 图标库
import * as Icons from "@ant-design/icons-vue"

const app = createApp(App);
app.use(store)
    .use(router)
    .use(Antd)
    .mount('#app')

//全局使用图标
const icons: any = Icons;
for(const i in icons){
    app.component(i,icons[i])
}

console.log("当前环境："+process.env.NODE_ENV)