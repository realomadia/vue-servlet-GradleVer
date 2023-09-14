import {createRouter, createWebHistory} from 'vue-router';
import LoginView from '@/components/LoginView.vue';
import HomeView from "@/components/HomeView.vue";

const routes = [
  {
    path: '/',
    component: HomeView
  },
  {
    path: '/login',
    component: LoginView

  },
];

const router = createRouter({
  history: createWebHistory(),
  routes
});

export default router;
