<script setup lang="ts">
import { dataFormat, loadData } from "@/util";
import { useRouter } from "vue-router";
import { ref, onMounted, computed, onUnmounted } from "vue";
import { Store } from "@tauri-apps/plugin-store";
import { BaseDirectory, readFile } from "@tauri-apps/plugin-fs";

const router = useRouter();

const data: dataFormat | null = await loadData();
if (!data) {
    router.push("/register");
}

const photoUrl = ref<string>("");

const tiltX = ref(50);
const tiltY = ref(50);
const debugInfo = ref("init");

function handleOrientation(e: DeviceOrientationEvent) {
    const gamma = e.gamma ?? 0;
    const beta = e.beta ?? 0;

    debugInfo.value = `gamma:${gamma.toFixed(1)} beta:${beta.toFixed(1)}`;

    const clampedGamma = Math.max(-45, Math.min(45, gamma));
    const clampedBeta = Math.max(-45, Math.min(45, beta - 45));

    tiltX.value = 50 + (clampedGamma / 45) * 50;
    tiltY.value = 50 + (clampedBeta / 45) * 50;
}

async function initTilt() {
    debugInfo.value = "initTilt called";

    if (
        typeof window === "undefined" ||
        !("DeviceOrientationEvent" in window)
    ) {
        debugInfo.value = "NO DeviceOrientationEvent on window";
        return;
    }

    const DOE = DeviceOrientationEvent as any;
    if (typeof DOE.requestPermission === "function") {
        try {
            const result = await DOE.requestPermission();
            debugInfo.value = `iOS permission result: ${result}`;
            if (result === "granted") {
                window.addEventListener("deviceorientation", handleOrientation);
            }
        } catch (error) {
            debugInfo.value = `permission error: ${error}`;
        }
    } else {
        debugInfo.value =
            "no requestPermission fn, attaching listener directly";
        window.addEventListener("deviceorientation", handleOrientation);
    }
}

onMounted(async () => {
    try {
        const store = await Store.load("settings.json");
        const photoPath = await store.get<string>("user_photo_path");

        if (photoPath) {
            const bytes = await readFile(photoPath, {
                baseDir: BaseDirectory.AppData,
            });
            const blob = new Blob([bytes]);
            photoUrl.value = URL.createObjectURL(blob);
        }
    } catch (error) {
        console.error("Błąd ładowania zdjęcia:", error);
    }

    initTilt();
});

onUnmounted(() => {
    if (photoUrl.value) URL.revokeObjectURL(photoUrl.value);
    window.removeEventListener("deviceorientation", handleOrientation);
});

const photoStyle = computed(() => {
    if (photoUrl.value) {
        return {
            backgroundImage: `url(${photoUrl.value})`,
        };
    }
    return {};
});

const emblemHoloStyle = computed(() => ({
    "--tilt-x": `${tiltX.value}%`,
    "--tilt-y": `${tiltY.value}%`,
}));
</script>
<template>
    <div class="card">
        <div class="card-top">
            <div class="top-row">
                <div class="photo-col">
                    <div
                        class="photo"
                        :style="photoStyle"
                        :class="{ 'has-photo': photoUrl }"
                    ></div>

                    <div class="flag"></div>

                    <div class="custom-emblem">
                        <div class="emblem-stack">
                            <div class="emblem-grayscale">
                                <div class="eagle-silhouette"></div>
                                <div class="eagle-detailed"></div>
                            </div>
                            <div
                                class="emblem-holo"
                                :style="emblemHoloStyle"
                            ></div>
                        </div>
                        <div class="emblem-text">
                            Rzeczpospolita<br />Polska
                        </div>
                    </div>
                </div>

                <div class="fields">
                    <div class="field">
                        <div class="value">{{ data?.imie.toUpperCase() }}</div>
                        <div class="label">Imię (imiona)</div>
                    </div>
                    <div class="field">
                        <div class="value">
                            {{ data?.nazwisko.toUpperCase() }}
                        </div>
                        <div class="label">Nazwisko</div>
                    </div>
                    <div class="field">
                        <div class="value">POLSKIE</div>
                        <div class="label">Obywatelstwo</div>
                    </div>
                    <div class="field">
                        <div class="value">{{ data?.birth }}</div>
                        <div class="label">Data urodzenia</div>
                    </div>
                    <div class="field">
                        <div class="value">{{ data?.pesel }}</div>
                        <div class="label">Numer PESEL</div>
                    </div>
                </div>
            </div>
        </div>

        <div class="status">
            <div class="check">
                <svg
                    viewBox="0 0 24 24"
                    fill="none"
                    stroke="#5e882e"
                    stroke-width="3"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                >
                    <polyline points="20 6 9 17 4 12"></polyline>
                </svg>
            </div>
            <div class="label">Dokument ważny</div>
        </div>
    </div>
</template>
<style lang="css" scoped>
.debug-overlay {
    position: fixed;
    top: 0;
    left: 0;
    right: 0;
    z-index: 9999;
    background: red;
    color: #fff;
    font-size: 12px;
    padding: 4px 8px;
    font-family: monospace;
}

.card {
    border-radius: 20px;
    overflow: hidden;
    background: #fff;
    position: relative;
    margin-bottom: 20px;
}

.card::before,
.card::after {
    content: "";
    position: absolute;
    inset: 0;
    pointer-events: none;
    z-index: 10;
    border-radius: 20px;
}

.card::before {
    background-image: linear-gradient(
        110deg,
        rgba(255, 255, 255, 0.05),
        rgba(173, 216, 230, 0.1),
        rgba(144, 238, 144, 0.1),
        rgba(255, 255, 224, 0.1),
        rgba(255, 182, 193, 0.1),
        rgba(255, 255, 255, 0.05)
    );
    opacity: 0.8;
    mix-blend-mode: color-dodge;
    animation: holoGradient 12s linear infinite;
}

.card::after {
    background-image: repeating-linear-gradient(
        -45deg,
        rgba(255, 255, 255, 0.15) 0 1px,
        transparent 1px 12px
    );
    opacity: 0.5;
    mix-blend-mode: overlay;
    animation: holoPattern 20s linear infinite;
}

@keyframes holoGradient {
    0% {
        background-position: 0% 50%;
    }
    100% {
        background-position: 200% 50%;
    }
}
@keyframes holoPattern {
    0% {
        background-position: 0px 0px;
    }
    100% {
        background-position: 50px 50px;
    }
}

.card-top {
    aspect-ratio: 742/838;
    height: 450px;
    background-image: url("@/assets/b3a09a2c-52c5-4532-9eb5-78553b894bb3-2.png");
    background-size: contain;
    padding: 24px 20px 28px;
    position: relative;
    overflow: hidden;
}

.top-row {
    display: flex;
    gap: 18px;
    position: relative;
    z-index: 15;
}

.photo-col {
    display: flex;
    flex-direction: column;
    gap: 14px;
    width: 140px;
}

.photo {
    aspect-ratio: 430/561;
    width: 130px;
    border-radius: 8px;
    background: #dfe6ec;
    background-size: contain;
    filter: grayscale(100%);
    display: flex;
    align-items: flex-end;
    justify-content: center;
    overflow: hidden;
    box-shadow: 0 2px 6px rgba(0, 0, 0, 0.08);
}

.flag {
    background-image: url("@/assets/flag.gif");
    image-rendering: auto;
    -webkit-font-smoothing: antialiased;
    background-size: contain;
    aspect-ratio: 96/56;
    width: 70px;
    border-radius: 6px;
    overflow: hidden;
}

.custom-emblem {
    display: flex;
    flex-direction: row;
    align-items: center;
    gap: 4px;
    margin-top: 5px;
}

.emblem-stack {
    aspect-ratio: 742/878;
    position: relative;
    width: 30px;
}

.emblem-grayscale {
    position: absolute;
    inset: 0;
    filter: grayscale(100%);
}

.eagle-detailed {
    position: absolute;
    inset: 0;
    background-image: url("@/assets/orzel.png");
    background-size: contain;
    background-repeat: no-repeat;
    background-position: center;
    z-index: 1;
}

.eagle-silhouette {
    position: absolute;
    inset: 0;
    background-image: url("@/assets/background.png");
    background-size: contain;
    background-repeat: no-repeat;
    background-position: center;
    opacity: 0.6;
    z-index: 0;
}

.emblem-holo {
    position: absolute;
    inset: 0;
    z-index: 2;
    pointer-events: none;
    background-image: linear-gradient(
        90deg,
        rgba(255, 0, 0, 0.9) 0%,
        rgba(160, 160, 160, 0.9) 25%,
        rgba(255, 220, 0, 0.9) 50%,
        rgba(0, 100, 255, 0.9) 75%,
        rgba(255, 0, 0, 0.9) 100%
    );
    background-size: 350% 250%;
    background-position: var(--tilt-x, 50%) var(--tilt-y, 50%);
    mix-blend-mode: normal;
    opacity: 0.3;
    transition: background-position 0.05s linear;
    -webkit-mask-image: url("@/assets/orzel.png");
    -webkit-mask-size: contain;
    -webkit-mask-repeat: no-repeat;
    -webkit-mask-position: center;
    mask-image: url("@/assets/orzel.png");
    mask-size: contain;
    mask-repeat: no-repeat;
    mask-position: center;
}

.emblem-text {
    font-size: 9px;
    line-height: 1.1;
    color: rgba(20, 40, 70, 0.28);
    font-weight: 600;
    text-align: left;
}

.fields {
    flex: 1;
    position: relative;
    z-index: 1;
    display: flex;
    flex-direction: column;
    gap: 16px;
}

.field .value {
    font-size: 15px;
    font-weight: 500;
    color: var(--text-dark);
    letter-spacing: 0.2px;
}
.field .label {
    font-size: 11px;
    color: var(--text-muted);
    margin-top: 1px;
}

.status {
    background: #fff;
    padding: 22px 20px;
    display: flex;
    align-items: center;
    gap: 10px;
    border-top: 1px solid var(--line);
    position: relative;
    z-index: 15;
}
.status .check {
    width: 22px;
    height: 22px;
    border-radius: 50%;
    border: 2px solid var(--accent-green);
    display: flex;
    align-items: center;
    justify-content: center;
    flex-shrink: 0;
}
.status .check svg {
    width: 12px;
    height: 12px;
}
.status .label {
    font-size: 14px;
    font-weight: 600;
    color: var(--accent-green);
}
</style>
