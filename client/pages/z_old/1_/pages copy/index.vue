<template>

  <div>
    <!-- <div v-if="error" class="text-red-700"> 
        <ErrorAlert : message="error.message"/>
    </div> -->
    <h1>User List</h1>
    <ul>
        <li v-for="user in users" :key="user.id"> 
         <!-- <NuxtLink :to="{name:`/${user.studentName}`, params:{id:$route.params.id}}">
            {{ user.studentName }} 
          </NuxtLink>  -->


          <!-- <NuxtLink :to="user.studentName">
            {{ user.studentName }} 
          </NuxtLink> -->



                    <!-- <NuxtLink :to="this.$router.push({path: user.studentName, params: { id: 1 }})">
            {{ user.studentName }} 
          </NuxtLink> -->


          <!-- <NuxtLink @click="this.$router.push({path: user.studentName, params: { id: 1 }})">
            {{ user.studentName }} 
          </NuxtLink> -->

          <!-- <NuxtLink :to="{ path: user.studentName,  params: { slug: user.id, num:user.id, name:user.studentid, id:user.studentid }}">
            {{ user.studentName }} 
          <br>
          {{ user.studentid }} 
          </NuxtLink> -->


          <!-- <NuxtLink :to="user.studentName+'/'+user.studentid">
            {{ user.studentName }} 
          <br>
          {{ user.studentid }} 
          </NuxtLink> -->

          <router-link :to="'/user/'+user.studentid">
            {{ user.studentName }} 
          <br>
          <!-- {{ user.studentid }}  -->
          </router-link>



        </li>
        
    </ul>

  </div>
  
</template>

<script>
import axios from 'axios'
export default {
  head(){
      // CORS_ALLOW_ALL_ORIGINS=True
      // ALLOWED_HOSTS=['*']
  },
  data(){
    return{
      users: "nothing loading"
    }
  },
  // async asyncData( context ) {
  //   try{
  //     const api = 'http://localhost:9000/api/users'
  //     const users = await axios.get(api)
  //     console.log(users.data, "async1")
  //     return users.data
  //   } catch (err) {
  //     context.error({
  //       message:"ajax error"
  //     })
  //   }
  // }

  // asyncData(context){
  //     const api = '/api/users/'
  //     return axios.get(api)
  //     .then((res) =>{
  //       console.log(res.data, "asyncdata2")
  //       return { users: res.data}
  //     }) 
  //     .catch((error)=>{
  //       context.error({
  //         message: 'server error'
  //       })
  //     })
  // }

    // async asyncData({app}){
      
    //       const api = 'http://localhost:9000/api/users'
    //       const res = await app.$axios.$get(api)
    //       console.log(res, "async1")
    //       return {users: res} 
    // }

    async asyncData({app}){
      

          const res = await app.$axios.$get('/api/'+'users')
          console.log(res, "async1")
          return {users: res} 
    }


      // asyncData({app}){
      // const api = '/api/users/'
      // return app.$axios.$get(api)
      // .then((res) =>{
      //   console.log(res.data, "asyncdata2")
      //   return { users: res.data}
      // }) 
      // .catch((error)=>{
      //   context.error({
      //     message: 'server error'
      //   })
      // })
  //}

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
