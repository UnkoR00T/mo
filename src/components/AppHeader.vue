<template>
    <div class="app-header" v-if="display">
        <div
            class="icon-btn"
            v-if="route.meta.displayesBackButton"
            @click="back"
        >
            <svg
                viewBox="0 0 24 24"
                fill="none"
                stroke="currentColor"
                stroke-width="2.2"
                stroke-linecap="round"
                stroke-linejoin="round"
            >
                <path d="M15 18l-6-6 6-6" />
            </svg>
        </div>
        <div class="app-title" v-if="route.meta.displayesName">
            {{ route.name }}
        </div>
        <div class="icon-btn" v-if="route.meta.displayesInfo">
            <svg viewBox="0 0 24 24" fill="currentColor">
                <circle cx="5" cy="12" r="2" />
                <circle cx="12" cy="12" r="2" />
                <circle cx="19" cy="12" r="2" />
            </svg>
        </div>
    </div>
</template>
<script lang="ts" setup>
import { computed } from "vue";
import { useRoute, useRouter } from "vue-router";
let display = computed(
    () =>
        route.meta.displayesBackButton ||
        route.meta.displayesName ||
        route.meta.displayesInfo,
);
let route = useRoute();
let router = useRouter();
const back = () => {
    let query = route.query;
    router.push(query["back"]?.toString() ?? "/");
};
</script>
<style scoped>
.app-header {
    padding: 6px 22px 12px;
    display: flex;
    align-items: center;
    justify-content: space-between;
    background: #f3f4f6;
}
.icon-btn {
    width: 32px;
    height: 32px;
    display: flex;
    align-items: center;
    justify-content: center;
    color: #1c1c1e;
    cursor: pointer;
}
.icon-btn svg {
    width: 22px;
    height: 22px;
}

.app-title {
    font-size: 17px;
    font-weight: 600;
    color: #1c1c1e;
    letter-spacing: -0.2px;
}
</style>
