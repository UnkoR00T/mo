import { createRouter, createWebHistory } from "vue-router";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      component: () => import("@/layouts/AppLayout.vue"),
      children: [
        {
          path: "/",
          name: "Login",
          component: () => import("@/pages/LoginPage.vue"),
          meta: {
            displayesName: false,
            displayesInfo: false,
            displayesBackButton: false,
            hideNav: true,
          },
        },
        {
          path: "/documents",
          component: () => import("@/pages/DocumentsPage.vue"),
          name: "Dokumenty",
          meta: {
            displayesName: false,
            displayesInfo: false,
            displayesBackButton: false,
          },
        },
        {
          path: "/uslugi",
          component: () => import("@/pages/DocumentsPage.vue"),
          name: "Usługi",
          meta: {
            displayesName: false,
            displayesInfo: false,
            displayesBackButton: false,
          },
        },
        {
          path: "/qr",
          component: () => import("@/pages/DocumentsPage.vue"),
          name: "QR",
          meta: {
            displayesName: false,
            displayesInfo: false,
            displayesBackButton: false,
          },
        },
        {
          path: "/more",
          component: () => import("@/pages/DocumentsPage.vue"),
          name: "Więcej",
          meta: {
            displayesName: false,
            displayesInfo: false,
            displayesBackButton: false,
          },
        },
        {
          path: "/mdowod",
          component: () => import("@/pages/IDPage.vue"),
          name: "mDowód",
          meta: {
            displayesName: true,
            displayesInfo: true,
            displayesBackButton: true,
          },
        },
      ],
    },
    {
      path: "/register",
      name: "Register",
      component: () => import("@/pages/RegisterPage.vue"),
    },
  ],
});

export default router;
