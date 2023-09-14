import { createApp } from 'vue';
import App from '@/App.vue';
import router from '@/router';
import http from '@/api/http';
import yami from '@/api/yami';
import validator from 'validator';
import store from '@/store';
const app = createApp(App);

app.config.productionTip = false;

app.provide('$http', http); // axios 인스턴스를 할당
app.provide('$yami', yami);
app.config.globalProperties.$validator = validator;

app.use(router);
app.use(store);

app.mount('#app');
