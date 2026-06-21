<script setup lang="ts">
import IDCard from "@/components/IDCard.vue";
import { clearDataAndExit, dataFormat, loadData } from "@/util";
import { computed, onMounted, onUnmounted, Ref, ref } from "vue";

let curTime = ref(new Date());
let intervalId: any;
let data: Ref<dataFormat | null> = ref(null);

onMounted(async () => {
    intervalId = setInterval(() => {
        curTime.value = new Date();
    }, 1000);
    data.value = await loadData();
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
    <div class="time">
        {{ displayTime }}
    </div>
    <Suspense>
        <IDCard />
    </Suspense>
    <div class="quick-actions">
        <button class="action-item">
            <div class="action-circle action-circle--scan">
                <svg
                    width="24"
                    height="24"
                    viewBox="0 0 24 24"
                    fill="none"
                    stroke="#3478c7"
                    stroke-width="2"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                >
                    <path d="M3 7V5a2 2 0 0 1 2-2h2" />
                    <path d="M17 3h2a2 2 0 0 1 2 2v2" />
                    <path d="M21 17v2a2 2 0 0 1-2 2h-2" />
                    <path d="M7 21H5a2 2 0 0 1-2-2v-2" />
                    <path d="m9 11 2 2 4-4" />
                </svg>
            </div>
            <span class="action-label">Potwierdź<br />swoje dane</span>
        </button>

        <button class="action-item">
            <div class="action-circle action-circle--card">
                <svg
                    width="24"
                    height="24"
                    viewBox="0 0 24 24"
                    fill="none"
                    stroke="#c14d6e"
                    stroke-width="2"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                >
                    <path d="M16 10h2" />
                    <path d="M16 14h2" />
                    <path d="M6.17 15a3 3 0 0 1 5.66 0" />
                    <circle cx="9" cy="11" r="2" />
                    <rect x="2" y="5" width="20" height="14" rx="2" />
                </svg>
            </div>
            <span class="action-label">Dane dowodu<br />osobistego</span>
        </button>

        <button class="action-item">
            <div class="action-circle action-circle--shield">
                <svg
                    width="24"
                    height="24"
                    viewBox="0 0 24 24"
                    fill="none"
                    stroke="#2f6fb0"
                    stroke-width="2"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                >
                    <path
                        d="M12 2 4 5v6c0 5 3.5 8.5 8 10 4.5-1.5 8-5 8-10V5l-8-3Z"
                    />
                    <rect x="9.5" y="11" width="5" height="4" rx="0.5" />
                    <path d="M12 11v-1.5a1.5 1.5 0 1 1 3 0" />
                </svg>
            </div>
            <span class="action-label">Zastrzeż<br />PESEL</span>
        </button>

        <button class="action-item" @click="() => clearDataAndExit()">
            <div class="action-circle action-circle--more">
                <svg
                    width="24"
                    height="24"
                    viewBox="0 0 24 24"
                    fill="none"
                    stroke="#86878d"
                    stroke-width="2.5"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                >
                    <circle cx="5" cy="12" r="1.5" fill="#86878d" />
                    <circle cx="12" cy="12" r="1.5" fill="#86878d" />
                    <circle cx="19" cy="12" r="1.5" fill="#86878d" />
                </svg>
            </div>
            <span class="action-label">Pozostałe<br />skróty</span>
        </button>
    </div>
    <div class="actions">
        <div class="doc-card">
            <div class="field-row field-row--with-action">
                <div class="field-text">
                    <span class="field-label">Seria i numer mDowodu</span>
                    <span class="field-value2">{{ data?.serialNumber }}</span>
                </div>
                <button class="copy-btn">Kopiuj</button>
            </div>
            <p class="field-note">
                Dane mDowodu i dowodu osobistego są inne – to dwa różne
                dokumenty.
            </p>

            <div class="divider" />

            <div class="field-row">
                <span class="field-label">Termin ważności mDowodu</span>
                <span class="field-value2">{{ data?.expDate }}</span>
            </div>

            <div class="divider" />

            <div class="field-row">
                <span class="field-label">Data wydania mDowodu</span>
                <span class="field-value2">{{ data?.assDate }}</span>
            </div>

            <div class="divider" />

            <div class="field-row">
                <span class="field-label">Imię ojca</span>
                <span class="field-value2">{{ data?.fatherName }}</span>
            </div>

            <div class="divider" />

            <div class="field-row">
                <span class="field-label">Imię matki</span>
                <span class="field-value2">{{ data?.motherName }}</span>
            </div>
        </div>
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
                <span>{{ data?.birth }}</span>
            </div>
            <button class="btn-update">Aktualizuj</button>
        </div>
    </div>
</template>

<style scoped>
.doc-card {
    background: #fff;
    border-radius: 16px;
    padding: 18px 16px 6px;
    box-shadow: 0 1px 3px rgba(0, 0, 0, 0.04);
}

.field-row {
    display: flex;
    flex-direction: column;
    gap: 4px;
    padding: 10px 0;
}

.field-row--with-action {
    flex-direction: row;
    justify-content: space-between;
    align-items: flex-start;
    padding-bottom: 4px;
}

.field-text {
    display: flex;
    flex-direction: column;
    gap: 4px;
}

.field-label {
    font-size: 13px;
    color: #8a8b90;
}

.field-value2 {
    font-size: 19px;
    font-weight: 700;
    color: #1c1c1e;
}

.field-note {
    font-size: 12.5px;
    color: #9a9ba0;
    line-height: 1.4;
    margin: 2px 0 10px;
}

.copy-btn {
    background: #e4eef9;
    color: #3478c7;
    border: none;
    border-radius: 18px;
    padding: 7px 16px;
    font-size: 13px;
    font-weight: 600;
    cursor: pointer;
    flex-shrink: 0;
    margin-top: 2px;
}

.divider {
    height: 1px;
    background: #eef0f2;
    margin: 5px 0px;
}

.divider--full {
    margin: 4px -16px 0;
}

.expand-row {
    display: flex;
    justify-content: space-between;
    align-items: center;
    width: 100%;
    background: none;
    border: none;
    padding: 14px 0;
    cursor: pointer;
}

.expand-label {
    font-size: 16px;
    font-weight: 600;
    color: #1c1c1e;
}
.quick-actions {
    display: flex;
    justify-content: space-between;
    padding: 0 0px;
    gap: 4px;
}

.action-item {
    display: flex;
    flex-direction: column;
    align-items: center;
    gap: 8px;
    background: none;
    border: none;
    flex: 1;
    padding: 0;
    cursor: pointer;
}

.action-circle {
    width: 56px;
    height: 56px;
    border-radius: 50%;
    display: flex;
    align-items: center;
    justify-content: center;
    flex-shrink: 0;
    background-color: #ffffff;
}

.action-label {
    font-size: 12px;
    line-height: 1.3;
    color: #5d5e63;
    text-align: center;
    font-weight: 500;
}
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
    margin-top: 18px;
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
