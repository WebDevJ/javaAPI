export default {
  // Global page headers: https://go.nuxtjs.dev/config-head
  head: {
    title: 'nuxtClient',
    htmlAttrs: {
      lang: 'en'
    },
    meta: [
      { charset: 'utf-8' },
      { name: 'viewport', content: 'width=device-width, initial-scale=1' },
      { hid: 'description', name: 'description', content: '' }
    ],
    link: [
      { rel: 'icon', type: 'image/x-icon', href: '/favicon.ico' }
    ]
  },

  // Global CSS: https://go.nuxtjs.dev/config-css
  css: [
  ],

  // Plugins to run before rendering page: https://go.nuxtjs.dev/config-plugins
  plugins: [
    {src: '~/plugins/axios'}
  ],

  // Auto import components: https://go.nuxtjs.dev/config-components
  components: true,

  // Modules for dev and build (recommended): https://go.nuxtjs.dev/config-modules
  buildModules: [
  ],

  // Modules: https://go.nuxtjs.dev/config-modules
  modules: [
    '@nuxtjs/proxy',
    '@nuxtjs/axios'
  ],

  axios: {
    proxy: true // avoid CORS issues //Can be also an object with default options
  },
  env:{
    API_KEY: "hireJames"
  },
  proxy: {
    '/api/':{
      target: 'http://localhost:9000/api/',
      pathRewrite: {'^/api/': ""}
    },
    '/api/user/':{
      target: 'http://localhost:9000/api/user/',
      pathRewrite: {'^/api/user/': ""}
    },
     
  },

  // Build Configuration: https://go.nuxtjs.dev/config-build
  build: {
  },
  router: {
    routes: [
      {
        name: 'index',
        path: '/',
        component: 'pages/index.vue'
      },
      {
        name: 'user-id',
        path: '/user/:id?',
        component: 'pages/user/_id.vue'
      },
      {
        name: 'slug',
        path: '/:slug',
        component: 'pages/_slug.vue'
      },
      {
        name: 'slug-comments',
        path: '/:slug/comments',
        component: 'pages/_slug/comments.vue'
      }
    ]
  }
}
