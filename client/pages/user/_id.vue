<template>
  <div>
    <NuxtLink to="/"> Home </NuxtLink>
    <h1>user:</h1>
    {{ user.studentName }}
    <h1>id:</h1>
    {{ $route.params.id }}
  </div>
</template>
<script>
import axios from "axios";
export default {
  head() {},
  data() {
    return {
      user: "nothing loading",
    };
  },
  async asyncData({ app, params }) {
    console.log("/api/" + "user/" + `${params.id}`, "paramsURL");
    const res = await app.$axios.$get("/api/user/" + `${params.id}`);
    console.log(res, "async2");
    return { user: res };
  },
};
</script>