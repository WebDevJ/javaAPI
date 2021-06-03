<template>

  <div>
    <!-- <div v-if="error" class="text-red-700"> 
        <ErrorAlert : message="error.message"/>
    </div> -->
    <h1>User List</h1>
    <ul>
        <li v-for="user in users" :key="user.id">
          <NuxtLink :to="user.studentName">
            {{ user.studentName }} 
          </NuxtLink>

        </li>
    </ul>
  </div>
  
</template>

<script>
import axios from 'axios'
export default {
  mounted() {
    this.$nextTick(() => {
      this.$nuxt.$loading.start()
      setTimeout(() => this.$nuxt.$loading.finish(), 500)
    })
  },
  
  async asyncData() {
    const config = {
      headers: {
        Accept: "application/json"
      }
    }

    try{
      const api = 'http://localhost:9000/api/users'
      const users = await axios.get(api,config).then((response) => {
                  console.log(response.data, "resss")
          return response.data
      })
      return { users }
    } catch (error) {
      return { error }
    }
  },
  data() {
    return {
      error: '',
    }
  },
}  
</script>

<style>
/* .container {
  margin: 0 auto;
  min-height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  text-align: center;
}

.title {
  font-family:
    'Quicksand',
    'Source Sans Pro',
    -apple-system,
    BlinkMacSystemFont,
    'Segoe UI',
    Roboto,
    'Helvetica Neue',
    Arial,
    sans-serif;
  display: block;
  font-weight: 300;
  font-size: 100px;
  color: #35495e;
  letter-spacing: 1px;
}

.subtitle {
  font-weight: 300;
  font-size: 42px;
  color: #526488;
  word-spacing: 5px;
  padding-bottom: 15px;
}

.links {
  padding-top: 15px;
} */
</style>
