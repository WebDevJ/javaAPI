<template>
  <div>
    <!-- <div v-if="error" class="text-red-700"> 
        <ErrorAlert : message="error.message"/>
    </div> -->
    <h1>User List</h1>
    <ul>
      <li v-for="user in users" :key="user.id">
        <router-link :to="'/user/' + user.studentid">
          {{ user.studentName }}
          <br />
        </router-link>
      </li>
    </ul>
  </div>
</template>
<script>
import axios from "axios";
export default {
  head() {},
  data() {
    return {
      users: "nothing loading",
    };
  },
  async asyncData({ app }) {
    const res = await app.$axios.$get("/api/" + "users");
    console.log(res, "async1");
    return { users: res };
  },
};
</script>
