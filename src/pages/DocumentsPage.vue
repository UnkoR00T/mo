<script setup lang="ts">
import { useRouter } from "vue-router";

let router = useRouter();
const toDowod = () => {
    router.push({
        path: "/mdowod",
        query: {
            back: "/documents",
        },
    });
};
</script>
<template>
    <div class="top-bar">
        <div class="logo" />
        <svg
            xmlns="http://www.w3.org/2000/svg"
            width="35"
            height="35"
            viewBox="0 0 24 24"
            fill="none"
            stroke="currentColor"
            stroke-width="2"
            stroke-linecap="round"
            stroke-linejoin="round"
            class="lucide lucide-bell-icon lucide-bell"
        >
            <path d="M10.268 21a2 2 0 0 0 3.464 0" />
            <path
                d="M3.262 15.326A1 1 0 0 0 4 17h16a1 1 0 0 0 .74-1.673C19.41 13.956 18 12.499 18 8A6 6 0 0 0 6 8c0 4.499-1.411 5.956-2.738 7.326"
            />
        </svg>
    </div>
    <h1>Dokumenty</h1>
    <div class="tools">
        <span>Dostosuj</span>
        <span>Dodaj</span>
    </div>
    <div class="cards">
        <div class="card" @click="toDowod">
            <div class="card_title">mDowód</div>
            <div class="card_emblem"></div>
        </div>
    </div>
</template>
<style lang="css" scoped>
.logo {
    background-image: url("@/assets/mobywatel.png");
    background-size: 50px;
    background-position: center;
}
.top-bar {
    display: flex;
    justify-content: space-between;
    margin-top: 5px;
}
.top-bar > svg {
    color: var(--text-muted);
}
.top-bar > * {
    height: 35px;
    width: 35px;
    border-radius: 8px;
}
h1 {
    padding-left: 5px;
    margin-top: 20px;
    font-size: 40px;
}
.tools {
    margin-top: 10px;
    display: flex;
    flex-direction: row-reverse;
    text-align: right;
    gap: 20px;
    font-weight: 600;
    color: #1d63f8;
}
.cards {
    margin-top: 15px;
}
.card {
    height: 240px;
    border-radius: 18px;
    position: relative;
    overflow: hidden;
    background: #003ba8;
    background: linear-gradient(
        83deg,
        rgba(0, 59, 168, 1) 0%,
        rgba(0, 95, 158, 1) 100%
    );
    font-family: -apple-system, "Segoe UI", Roboto, Arial, sans-serif;
}
.card::after {
    content: "";
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background-image: url("@/assets/b3a09a2c-52c5-4532-9eb5-78553b894bb3-2.png"); /* <-- put your background here */
    background-size: cover;
    background-position: center;
    opacity: 0.7; /* <-- adjust transparency */
    mix-blend-mode: overlay; /* try also: overlay, lighten, soft-light */
    pointer-events: none;
}

.card_title {
    position: absolute;
    top: 26px;
    left: 24px;
    color: #ffffff;
    font-size: 20px;
    font-weight: 600;
    letter-spacing: 0.2px;
}
.card_emblem::after {
    content: "";
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    border-radius: 10px;

    background: rgba(200, 200, 200, 0.3);
    z-index: 1;
}
.card_emblem {
    position: absolute;
    top: 20px;
    right: 16px;
    width: 38px;
    height: 38px;
    background-image: url("@/assets/orzel.png");
    background-position: center;
    background-size: 28px;
    background-repeat: no-repeat;
    display: flex;
    align-items: center;
    justify-content: center;
    z-index: 2;
}
</style>
