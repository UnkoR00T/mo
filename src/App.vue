<script setup lang="ts">
import IDCard from "./components/IDCard.vue";
import AppHeader from "./components/AppHeader.vue";
import { computed, onMounted, onUnmounted, ref } from "vue";

let curTime = ref(new Date());
let intervalId: any;

onMounted(() => {
    intervalId = setInterval(() => {
        curTime.value = new Date();
    }, 1000);
});

onUnmounted(() => {
    clearInterval(intervalId);
});
let displayTime = computed(() => {
    const d = curTime.value;
    const hours = d.getHours().toString().padStart(2, "0");
    const minutes = d.getMinutes().toString().padStart(2, "0");
    const seconds = d.getSeconds().toString().padStart(2, "0");
    const day = d.getDate().toString().padStart(2, "0");
    const month = (d.getMonth() + 1).toString().padStart(2, "0");
    return `Czas: ${hours}:${minutes}:${seconds} ${day}.${month}.${d.getFullYear()}`;
});
</script>

<template>
    <div class="phone">
        <AppHeader />

        <!-- 主内容 -->
        <div class="content">
            <div class="time">
                {{ displayTime }}
            </div>
            <!-- ID 卡片 -->
            <IDCard />

            <!-- 操作按钮 -->
            <div class="actions">
                <button class="btn btn-secondary">
                    <div class="btn-content">
                        <div class="btn-icon">
                            <svg
                                xmlns="http://www.w3.org/2000/svg"
                                width="12"
                                height="12"
                                viewBox="0 0 24 24"
                                fill="none"
                                stroke="#5687b6"
                                stroke-width="3"
                                stroke-linecap="round"
                                stroke-linejoin="round"
                                class="lucide lucide-check-icon lucide-check"
                            >
                                <path d="M20 6 9 17l-5-5" />
                            </svg>
                            <svg
                                xmlns="http://www.w3.org/2000/svg"
                                width="24"
                                height="24"
                                viewBox="0 0 24 24"
                                fill="none"
                                stroke="#5687b6"
                                stroke-width="2"
                                stroke-linecap="round"
                                stroke-linejoin="round"
                                class="lucide lucide-scan-icon lucide-scan"
                            >
                                <path d="M3 7V5a2 2 0 0 1 2-2h2" />
                                <path d="M17 3h2a2 2 0 0 1 2 2v2" />
                                <path d="M21 17v2a2 2 0 0 1-2 2h-2" />
                                <path d="M7 21H5a2 2 0 0 1-2-2v-2" />
                            </svg>
                        </div>
                        <div class="btn-text-wrap">
                            <span>Potwierdź swoje dane</span>
                        </div>
                    </div>
                    <svg
                        width="20"
                        height="20"
                        viewBox="0 0 24 24"
                        fill="none"
                        stroke="#86878d"
                        stroke-width="2"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                    >
                        <path d="M9 18l6-6-6-6" />
                    </svg>
                </button>

                <button class="btn btn-secondary">
                    <div class="btn-content">
                        <div class="btn-icon">
                            <svg
                                xmlns="http://www.w3.org/2000/svg"
                                width="24"
                                height="24"
                                viewBox="0 0 24 24"
                                fill="none"
                                stroke="#5687b6"
                                stroke-width="2"
                                stroke-linecap="round"
                                stroke-linejoin="round"
                                class="lucide lucide-id-card-icon lucide-id-card"
                            >
                                <path d="M16 10h2" />
                                <path d="M16 14h2" />
                                <path d="M6.17 15a3 3 0 0 1 5.66 0" />
                                <circle cx="9" cy="11" r="2" />
                                <rect
                                    x="2"
                                    y="5"
                                    width="20"
                                    height="14"
                                    rx="2"
                                />
                            </svg>
                        </div>
                        <div class="btn-text-wrap">
                            <span>Dane dokumentu</span>
                        </div>
                    </div>
                    <svg
                        width="20"
                        height="20"
                        viewBox="0 0 24 24"
                        fill="none"
                        stroke="#86878d"
                        stroke-width="2"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                    >
                        <path d="M9 18l6-6-6-6" />
                    </svg>
                </button>
                <button class="btn btn-secondary">
                    <div class="btn-content">
                        <div class="btn-text-wrap">
                            <span>Twoje dodatkowe dane</span>
                        </div>
                    </div>
                    <svg
                        width="20"
                        height="20"
                        viewBox="0 0 24 24"
                        fill="none"
                        stroke="#86878d"
                        stroke-width="2"
                        stroke-linecap="round"
                        stroke-linejoin="round"
                        style="transform: rotate(90deg)"
                    >
                        <path d="M9 18l6-6-6-6" />
                    </svg>
                </button>
                <div class="btn btn-secondary">
                    <div class="update-content">
                        <span class="subtle">Ostatnia aktualizacja</span>
                        <span>15.06.2026</span>
                    </div>
                    <button class="btn-update">Aktualizuj</button>
                </div>
                <button class="btn btn-secondary">
                    <div class="btn-content btn-delete">
                        <div class="btn-icon">
                            <svg
                                xmlns="http://www.w3.org/2000/svg"
                                width="24"
                                height="24"
                                viewBox="0 0 24 24"
                                fill="none"
                                stroke="currentColor"
                                stroke-width="2"
                                stroke-linecap="round"
                                stroke-linejoin="round"
                                class="lucide lucide-trash2-icon lucide-trash-2"
                            >
                                <path d="M10 11v6" />
                                <path d="M14 11v6" />
                                <path
                                    d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6"
                                />
                                <path d="M3 6h18" />
                                <path
                                    d="M8 6V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"
                                />
                            </svg>
                        </div>
                        <div class="btn-text-wrap">
                            <span>Usuń dokument</span>
                        </div>
                    </div>
                </button>
            </div>
        </div>

        <!-- 底部导航 -->
        <div class="bottom-nav">
            <div class="nav-item active">
                <svg
                    id="Warstwa_5"
                    data-name="Warstwa 5"
                    xmlns="http://www.w3.org/2000/svg"
                    viewBox="0 0 24 24"
                    fill="currentColor"
                >
                    <path d="M12,3 L21,11 V21 H3 V11 Z" />

                    <path
                        fill="white"
                        d="M9,21 v-4 c0-.83.67-1.5 1.5-1.5h3c.83,0 1.5.67 1.5 1.5v4 Z"
                    />
                </svg>

                <span class="nav-label">Pulpit</span>
            </div>
            <div class="nav-item">
                <svg
                    xmlns="http://www.w3.org/2000/svg"
                    width="24"
                    height="24"
                    viewBox="0 0 24 24"
                    fill="none"
                    stroke="currentColor"
                    stroke-width="2"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    class="lucide lucide-square-user-round-icon lucide-square-user-round"
                >
                    <path d="M18 21a6 6 0 0 0-12 0" />
                    <circle cx="12" cy="11" r="4" />
                    <rect width="18" height="18" x="3" y="3" rx="2" />
                </svg>
                <span class="nav-label">Dokumenty</span>
            </div>
            <div class="nav-item">
                <svg
                    xmlns="http://www.w3.org/2000/svg"
                    width="24"
                    height="24"
                    viewBox="0 0 24 24"
                    fill="none"
                    stroke="currentColor"
                    stroke-width="2"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    class="lucide lucide-folder-icon lucide-folder"
                >
                    <path
                        d="M20 20a2 2 0 0 0 2-2V8a2 2 0 0 0-2-2h-7.9a2 2 0 0 1-1.69-.9L9.6 3.9A2 2 0 0 0 7.93 3H4a2 2 0 0 0-2 2v13a2 2 0 0 0 2 2Z"
                    />
                </svg>
                <span class="nav-label">Usługi</span>
            </div>
            <div class="nav-item">
                <svg
                    xmlns="http://www.w3.org/2000/svg"
                    width="24"
                    height="24"
                    viewBox="0 0 24 24"
                    fill="none"
                    stroke="currentColor"
                    stroke-width="2"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    class="lucide lucide-scan-barcode-icon lucide-scan-barcode"
                >
                    <path d="M3 7V5a2 2 0 0 1 2-2h2" />
                    <path d="M17 3h2a2 2 0 0 1 2 2v2" />
                    <path d="M21 17v2a2 2 0 0 1-2 2h-2" />
                    <path d="M7 21H5a2 2 0 0 1-2-2v-2" />
                    <path d="M8 7v10" />
                    <path d="M12 7v10" />
                    <path d="M17 7v10" />
                </svg>
                <span class="nav-label">Kod QR</span>
            </div>
            <div class="nav-item">
                <svg
                    xmlns="http://www.w3.org/2000/svg"
                    width="24"
                    height="24"
                    viewBox="0 0 24 24"
                    fill="none"
                    stroke="currentColor"
                    stroke-width="2"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                    class="lucide lucide-circle-ellipsis-icon lucide-circle-ellipsis"
                >
                    <circle cx="12" cy="12" r="10" />
                    <path d="M17 12h.01" />
                    <path d="M12 12h.01" />
                    <path d="M7 12h.01" />
                </svg>
                <span class="nav-label">Więcej</span>
            </div>
        </div>
    </div>
</template>

<style scoped>
.time {
    text-align: center;
    font-size: 14px;
    color: var(--text-muted);
    padding: 5px 0 20px 0;
}
.btn-delete {
    color: #d32f26;
}
.update-content {
    display: flex;
    flex-direction: column;
}
.update-content > .subtle {
    color: var(--text-muted);
    font-weight: normal;
    font-size: 12px;
    padding-bottom: 5px;
}
.btn-update {
    background-color: #dcebfc;
    border: none;
    padding: 7px 15px;
    font-size: 14px;
    font-weight: 600;
    border-radius: 42px;
    color: #2161a5;
}
/* 手机外框 */
.phone {
    width: 100dvw;
    height: 100dvh;
    background: #f4f5f7;
    display: flex;
    flex-direction: column;
    overflow: hidden;
}

/* 应用头部 */

/* 主内容 */
.content {
    flex: 1;
    min-height: 0; /* critical — without this a flex child won't shrink below its content size, so overflow-y:auto won't kick in */
    padding: 4px 18px 0;
    overflow-y: auto;
    overflow-x: hidden;
}
.content::-webkit-scrollbar {
    display: none;
}

/* 卡片标题 */
.card-section-title {
    font-size: 13px;
    font-weight: 500;
    color: #6b6b70;
    margin: 4px 4px 10px;
    letter-spacing: 0.2px;
}

/* ID 卡片 */
.id-card-wrap {
    perspective: 1200px;
    margin-bottom: 14px;
}

.id-card {
    background: linear-gradient(
        135deg,
        rgba(255, 255, 255, 1) 0%,
        rgba(248, 248, 250, 1) 100%
    );
    border-radius: 18px;
    padding: 18px 18px 16px;
    box-shadow:
        0 12px 28px rgba(0, 0, 0, 0.14),
        0 2px 6px rgba(0, 0, 0, 0.06),
        inset 0 1px 0 rgba(255, 255, 255, 0.8);
    position: relative;
    overflow: hidden;
    transition: transform 0.4s cubic-bezier(0.2, 0.8, 0.2, 1);
    border: 1px solid rgba(0, 0, 0, 0.04);
}

/* 卡片背景纹理 */
.id-card::before {
    content: "";
    position: absolute;
    top: -50%;
    right: -30%;
    width: 80%;
    height: 80%;
    background: radial-gradient(
        circle,
        rgba(212, 23, 60, 0.04) 0%,
        transparent 70%
    );
    pointer-events: none;
}

.id-card::after {
    content: "";
    position: absolute;
    bottom: 0;
    left: 0;
    right: 0;
    height: 1px;
    background: linear-gradient(
        90deg,
        transparent,
        rgba(212, 23, 60, 0.3),
        transparent
    );
}

.id-top {
    display: flex;
    justify-content: space-between;
    align-items: flex-start;
    margin-bottom: 18px;
    position: relative;
    z-index: 2;
}

.id-photo {
    width: 74px;
    height: 94px;
    border-radius: 4px;
    background: url("https://picsum.photos/seed/martakowalska/180/220")
        center/cover;
    box-shadow: 0 2px 6px rgba(0, 0, 0, 0.15);
    border: 1px solid rgba(0, 0, 0, 0.05);
    position: relative;
}
.id-photo::after {
    content: "";
    position: absolute;
    inset: 0;
    background: linear-gradient(180deg, transparent 60%, rgba(0, 0, 0, 0.08));
    border-radius: 4px;
}

.poland-coat {
    width: 44px;
    height: 44px;
    background: #fff;
    border-radius: 50%;
    border: 1.5px solid #d4d4d8;
    display: flex;
    align-items: center;
    justify-content: center;
    position: relative;
    box-shadow: 0 1px 3px rgba(0, 0, 0, 0.05);
}
.poland-coat-inner {
    width: 28px;
    height: 28px;
    background: linear-gradient(to bottom, #fff 50%, #d4173c 50%);
    border-radius: 50%;
    border: 1px solid #b0b0b5;
    box-shadow:
        inset 0 0 0 2px #fff,
        inset 0 0 0 3px #d4173c;
}

.id-fields {
    display: grid;
    grid-template-columns: 1fr 1fr;
    gap: 14px 14px;
    margin-bottom: 14px;
    position: relative;
    z-index: 2;
}

.field {
    display: flex;
    flex-direction: column;
    min-width: 0;
}
.field.full {
    grid-column: span 2;
}

.field-label {
    font-size: 9px;
    color: #8a8a90;
    text-transform: uppercase;
    letter-spacing: 0.6px;
    margin-bottom: 3px;
    font-weight: 500;
}

.field-value {
    font-size: 14px;
    font-weight: 600;
    color: #1c1c1e;
    letter-spacing: 0.1px;
    line-height: 1.2;
}

.field-value.mono {
    font-family: "Courier New", monospace;
    letter-spacing: 1px;
    font-size: 13px;
}

.id-footer {
    display: flex;
    justify-content: space-between;
    align-items: flex-end;
    padding-top: 12px;
    border-top: 1px dashed rgba(0, 0, 0, 0.08);
    position: relative;
    z-index: 2;
}

.expiry-block {
    display: flex;
    flex-direction: column;
}
.expiry-block .field-label {
    margin-bottom: 2px;
}

.mrz {
    font-family: "Courier New", monospace;
    font-size: 8.5px;
    color: #555;
    letter-spacing: 1.2px;
    background: rgba(0, 0, 0, 0.04);
    padding: 4px 6px;
    border-radius: 3px;
    max-width: 140px;
    line-height: 1.4;
    overflow: hidden;
    white-space: nowrap;
    text-overflow: ellipsis;
}

/* 有效徽章 */
.valid-badge {
    background: linear-gradient(95deg, #e8f5e9, #f1f8f2);
    color: #1b6b2e;
    padding: 12px 16px;
    border-radius: 14px;
    font-size: 14px;
    font-weight: 600;
    display: flex;
    align-items: center;
    gap: 10px;
    margin-bottom: 16px;
    border: 1px solid rgba(76, 175, 80, 0.2);
    box-shadow: 0 2px 8px rgba(46, 125, 50, 0.08);
}

.valid-check {
    width: 22px;
    height: 22px;
    background: #4caf50;
    border-radius: 50%;
    display: flex;
    align-items: center;
    justify-content: center;
    color: white;
    flex-shrink: 0;
    box-shadow: 0 2px 6px rgba(76, 175, 80, 0.4);
}
.valid-check svg {
    width: 13px;
    height: 13px;
}

.valid-text {
    flex: 1;
}
.valid-sub {
    font-size: 11px;
    font-weight: 400;
    color: #4a7c54;
    margin-top: 1px;
}

/* 操作按钮 */
.actions {
    display: flex;
    flex-direction: column;
    gap: 12px;
    margin-bottom: 16px;
}

.btn {
    padding: 20px 14px;
    border-radius: 14px;
    font-size: 15px;
    font-weight: 600;
    cursor: pointer;
    display: flex;
    align-items: center;
    justify-content: space-between;
    border: none;
    transition: all 0.15s;
    text-align: left;
}
.btn:active {
    transform: scale(0.98);
}

.btn-primary {
    background: linear-gradient(135deg, #d4173c, #b3122f);
    color: white;
    box-shadow: 0 4px 14px rgba(212, 23, 60, 0.3);
}
.btn-primary:active {
    box-shadow: 0 2px 8px rgba(212, 23, 60, 0.3);
}

.btn-secondary {
    background: #fff;
    color: #1c1c1e;
    box-shadow: 0 1px 3px rgba(0, 0, 0, 0.04);
}

.btn-icon {
    width: 32px;
    height: 32px;
    display: flex;
    align-items: center;
    justify-content: center;
    flex-shrink: 0;
    position: relative;
}
.btn-icon > svg {
    position: absolute;
}
.btn-primary .btn-icon {
    background: rgba(255, 255, 255, 0.2);
    color: white;
}
.btn-content {
    display: flex;
    align-items: center;
    gap: 12px;
    flex: 1;
}
.btn-text-wrap {
    display: flex;
    flex-direction: column;
}
.btn-sub {
    font-size: 11px;
    font-weight: 400;
    opacity: 0.8;
    margin-top: 1px;
}
.btn-primary .btn-sub {
    color: rgba(255, 255, 255, 0.85);
}
.btn-secondary .btn-sub {
    color: #8a8a90;
}

/* QR 卡片 */
.qr-card {
    background: #fff;
    border-radius: 14px;
    padding: 14px 16px;
    display: flex;
    align-items: center;
    gap: 14px;
    border: 1px solid #e5e5ea;
    margin-bottom: 14px;
    cursor: pointer;
    transition: transform 0.1s;
}
.qr-card:active {
    transform: scale(0.98);
}

.qr-icon {
    width: 42px;
    height: 42px;
    background: linear-gradient(135deg, #1c1c1e, #3a3a3e);
    border-radius: 10px;
    display: flex;
    align-items: center;
    justify-content: center;
    flex-shrink: 0;
}
.qr-icon svg {
    width: 24px;
    height: 24px;
}

.qr-text {
    flex: 1;
}
.qr-title {
    font-size: 14px;
    font-weight: 600;
    color: #1c1c1e;
}
.qr-sub {
    font-size: 12px;
    color: #8a8a90;
    margin-top: 2px;
}
.qr-arrow {
    color: #c7c7cc;
    font-size: 18px;
}

/* 底部导航 */
.bottom-nav {
    /* remove: position: absolute; bottom: 0; left: 0; right: 0; */
    background: rgba(255, 255, 255, 0.96);
    backdrop-filter: blur(20px);
    -webkit-backdrop-filter: blur(20px);
    border-top: 1px solid rgba(0, 0, 0, 0.06);
    display: flex;
    flex-shrink: 0; /* don't let it get squeezed */
    padding: 4px 0 28px;
    z-index: 100;
    padding-bottom: calc(max(env(safe-area-inset-bottom), 20px) + 45px);
    /* ^ swap margin-bottom for padding-bottom here, since it's no longer absolutely positioned and margin would just create a gap below it instead of safe-area padding */
}

.nav-item {
    flex: 1;
    display: flex;
    flex-direction: column;
    align-items: center;
    gap: 4px;
    cursor: pointer;
    position: relative;
    padding: 6px 0;
}

.nav-item svg {
    width: 24px;
    height: 24px;
    color: #9a9aa0;
    transition: color 0.2s;
}
.nav-item.active svg {
    color: #014994;
}

.nav-label {
    font-size: 10px;
    color: #9a9aa0;
    font-weight: 600;
    letter-spacing: 0.2px;
}
.nav-item.active .nav-label {
    color: #014994;
    font-weight: 600;
}

/* Home Indicator */
.home-indicator {
    position: absolute;
    bottom: 8px;
    left: 50%;
    transform: translateX(-50%);
    width: 134px;
    height: 5px;
    background: #1c1c1e;
    border-radius: 3px;
    z-index: 200;
}

/* 入场动画 */
@keyframes slideUp {
    from {
        opacity: 0;
        transform: translateY(20px);
    }
    to {
        opacity: 1;
        transform: translateY(0);
    }
}
.id-card-wrap {
    animation: slideUp 0.5s 0.1s both;
}
.valid-badge {
    animation: slideUp 0.5s 0.2s both;
}
.actions {
    animation: slideUp 0.5s 0.3s both;
}
.qr-card {
    animation: slideUp 0.5s 0.4s both;
}

@keyframes pulse {
    0%,
    100% {
        box-shadow: 0 2px 6px rgba(76, 175, 80, 0.4);
    }
    50% {
        box-shadow: 0 2px 12px rgba(76, 175, 80, 0.7);
    }
}
.valid-check {
    animation: pulse 2s infinite;
}

/* 鼠标悬停 3D 倾斜 */
@media (hover: hover) {
    .id-card-wrap:hover .id-card {
        transform: rotateX(2deg) rotateY(-2deg) translateZ(10px);
    }
}
</style>
