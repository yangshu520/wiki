<template>
  <a-layout>
      <the-header />
      <router-view />
      <the-footer />
    </a-layout>
</template>

<script>
import {defineComponent} from "vue"
import theHeader from "@/components/the-header"
import theFooter from "@/components/the-footer"
export default defineComponent({
  components:{
    theHeader,theFooter
  }
})
</script>

<style>
#components-layout-demo-top-side-2 .logo {
  float: left;
  width: 120px;
  height: 31px;
  margin: 16px 24px 16px 0;
  background: rgba(255, 255, 255, 0.3);
}
</style>
