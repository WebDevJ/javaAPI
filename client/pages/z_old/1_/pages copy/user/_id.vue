<template>
    <div>
    <NuxtLink to="/">
      Home
    </NuxtLink>
      <h1>user:</h1>
      {{ user.studentName }}
       <h1>id:</h1>
        {{$route.params.id}}
                <!-- {{$route.params.num}}
                {{$route.params.ids}}
                {{$route.params.id}}
                        {{$route.params.name}} -->




        <!-- <h1>id: {{user.studentid}}</h1>
        <p>Student Name: {{user.studentName}}</p> -->
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
      user: "nothing loading"
    }
  },
  // async asyncData({params, $axios}) {
  //       try{
  //         console.log(params, "paramsss")
  //     const api = `http://localhost:9000/api/user/1`
  //     // this.$route.params.slug
  //     const users = await axios.get(api).then((response) => {
  //       console.log(response.data, "resss")
  //         return response.data
  //     })
  //     return { users }
  //   } catch (error) {
  //     return { error }
  //   }
  // },
  // data() {
  //   return {
  //     error: '',
  //   }
  // },



    // asyncData(context){
    //   const api = 'http://localhost:9000/api/user/1'
    //   return axios.get(api)
    //   .then((res) =>{
    //     console.log(res.data, "asyncdata3")
    //     return { user: res.data}
    //   }) 
    //   .catch((error)=>{
    //     context.error({
    //       message: 'server error'
    //     })
    //   })
    // }

    async asyncData({app,params}){
      
          console.log('/api/'+'user/'+`${params.id}`, "paramsURL")
          const res = await app.$axios.$get('/api/user/'+`${params.id}`)
          console.log(res, "async2")
          return {user: res} 
    }




}  
</script>