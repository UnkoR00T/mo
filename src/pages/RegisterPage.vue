<script setup lang="ts">
import { Store } from "@tauri-apps/plugin-store";
import { writeFile, mkdir, BaseDirectory } from "@tauri-apps/plugin-fs";
import { useRouter } from "vue-router";
import { computed, nextTick, ref } from "vue";
import { saveData } from "@/util";

const router = useRouter();
const PHOTO_ASPECT_RATIO = 430 / 561;
const PHOTO_OUTPUT_WIDTH = 430;
const PHOTO_OUTPUT_HEIGHT = 561;

const photoInput = ref<HTMLInputElement | null>(null);
const cropImage = ref<HTMLImageElement | null>(null);
const selectedPhotoUrl = ref("");
const selectedPhotoName = ref("user_photo.jpg");
const croppedPhotoFile = ref<File | null>(null);
const isCropperOpen = ref(false);
const cropZoom = ref(1);
const cropOffsetX = ref(0);
const cropOffsetY = ref(0);
const isDraggingCrop = ref(false);
const dragStartX = ref(0);
const dragStartY = ref(0);
const dragOriginX = ref(0);
const dragOriginY = ref(0);

const cropImageStyle = computed(() => ({
    transform: `translate(-50%, -50%) translate(${cropOffsetX.value}px, ${cropOffsetY.value}px) scale(${cropZoom.value})`,
}));

const savePhoto = async (file: File): Promise<string> => {
    const buffer = new Uint8Array(await file.arrayBuffer());
    const ext = file.name.split(".").pop() || "jpg";
    const fileName = `user_photo.${ext}`;

    await mkdir("", { baseDir: BaseDirectory.AppData, recursive: true }).catch(
        () => {},
    );
    await writeFile(fileName, buffer, { baseDir: BaseDirectory.AppData });

    return fileName;
};

const resetCropState = () => {
    cropZoom.value = 1;
    cropOffsetX.value = 0;
    cropOffsetY.value = 0;
    isDraggingCrop.value = false;
};

const revokeSelectedPhotoUrl = () => {
    if (selectedPhotoUrl.value) {
        URL.revokeObjectURL(selectedPhotoUrl.value);
        selectedPhotoUrl.value = "";
    }
};

const handlePhotoUpload = async (event: Event) => {
    const input = event.target as HTMLInputElement;
    const file = input.files?.[0];
    croppedPhotoFile.value = null;

    if (!file) {
        revokeSelectedPhotoUrl();
        return;
    }

    revokeSelectedPhotoUrl();
    selectedPhotoName.value = file.name || "user_photo.jpg";
    selectedPhotoUrl.value = URL.createObjectURL(file);
    resetCropState();
    isCropperOpen.value = true;
    await nextTick();
};

const startCropDrag = (event: PointerEvent) => {
    isDraggingCrop.value = true;
    dragStartX.value = event.clientX;
    dragStartY.value = event.clientY;
    dragOriginX.value = cropOffsetX.value;
    dragOriginY.value = cropOffsetY.value;
    (event.currentTarget as HTMLElement).setPointerCapture(event.pointerId);
};

const moveCropDrag = (event: PointerEvent) => {
    if (!isDraggingCrop.value) return;
    cropOffsetX.value = dragOriginX.value + event.clientX - dragStartX.value;
    cropOffsetY.value = dragOriginY.value + event.clientY - dragStartY.value;
};

const endCropDrag = (event: PointerEvent) => {
    if (!isDraggingCrop.value) return;
    isDraggingCrop.value = false;
    (event.currentTarget as HTMLElement).releasePointerCapture(event.pointerId);
};

const dataUrlToFile = async (dataUrl: string, fileName: string) => {
    const response = await fetch(dataUrl);
    const blob = await response.blob();
    return new File([blob], fileName.replace(/\.[^.]+$/, ".jpg"), {
        type: "image/jpeg",
    });
};

const applyPhotoCrop = async () => {
    const image = cropImage.value;
    if (!image) return;

    const frameWidth = 320;
    const frameHeight = frameWidth / PHOTO_ASPECT_RATIO;
    const baseScale = Math.max(
        frameWidth / image.naturalWidth,
        frameHeight / image.naturalHeight,
    );
    const renderedWidth = image.naturalWidth * baseScale * cropZoom.value;
    const renderedHeight = image.naturalHeight * baseScale * cropZoom.value;
    const sourceX =
        ((renderedWidth - frameWidth) / 2 - cropOffsetX.value) /
        (baseScale * cropZoom.value);
    const sourceY =
        ((renderedHeight - frameHeight) / 2 - cropOffsetY.value) /
        (baseScale * cropZoom.value);
    const sourceWidth = frameWidth / (baseScale * cropZoom.value);
    const sourceHeight = frameHeight / (baseScale * cropZoom.value);

    const canvas = document.createElement("canvas");
    canvas.width = PHOTO_OUTPUT_WIDTH;
    canvas.height = PHOTO_OUTPUT_HEIGHT;
    const context = canvas.getContext("2d");
    if (!context) return;

    context.drawImage(
        image,
        sourceX,
        sourceY,
        sourceWidth,
        sourceHeight,
        0,
        0,
        PHOTO_OUTPUT_WIDTH,
        PHOTO_OUTPUT_HEIGHT,
    );

    croppedPhotoFile.value = await dataUrlToFile(
        canvas.toDataURL("image/jpeg", 0.92),
        selectedPhotoName.value,
    );
    isCropperOpen.value = false;
};

const cancelPhotoCrop = () => {
    croppedPhotoFile.value = null;
    revokeSelectedPhotoUrl();
    isCropperOpen.value = false;
    if (photoInput.value) photoInput.value.value = "";
};

const generatePesel = (dateStr: string, gender: "male" | "female"): string => {
    const date = new Date(dateStr);
    if (isNaN(date.getTime())) return "00000000000";

    let year = date.getFullYear();
    let month = date.getMonth() + 1;
    const day = date.getDate();

    if (year >= 1800 && year < 1900) month += 80;
    else if (year >= 2000 && year < 2100) month += 20;
    else if (year >= 2100 && year < 2200) month += 40;
    else if (year >= 2200 && year < 2300) month += 60;

    const yy = String(year).slice(-2).padStart(2, "0");
    const mm = String(month).padStart(2, "0");
    const dd = String(day).padStart(2, "0");

    const series = String(Math.floor(Math.random() * 1000)).padStart(3, "0");

    const genderChoices =
        gender === "female" ? [0, 2, 4, 6, 8] : [1, 3, 5, 7, 9];
    const genderDigit =
        genderChoices[Math.floor(Math.random() * genderChoices.length)];

    const base = `${yy}${mm}${dd}${series}${genderDigit}`;

    const weights = [1, 3, 7, 9, 1, 3, 7, 9, 1, 3];
    let sum = 0;
    for (let i = 0; i < 10; i++) {
        sum += parseInt(base[i]) * weights[i];
    }
    const controlDigit = (10 - (sum % 10)) % 10;

    return `${base}${controlDigit}`;
};

const formatDate = (dateStr: string): string => {
    if (!dateStr) return "";
    const [year, month, day] = dateStr.split("-");
    return `${day}.${month}.${year}`;
};
const generateUpdateDate = (rawBirth: string): Date => {
    const birth = new Date(rawBirth);
    const now = new Date();
    const updated = new Date(birth);
    updated.setFullYear(now.getFullYear());
    if (updated.getMonth() !== birth.getMonth()) {
        updated.setDate(0);
    }
    return updated;
};

const addYears = (date: Date, years: number): Date => {
    const result = new Date(date);
    result.setFullYear(result.getFullYear() + years);
    return result;
};

const formatDateObj = (date: Date): string => {
    const dd = String(date.getDate()).padStart(2, "0");
    const mm = String(date.getMonth() + 1).padStart(2, "0");
    const yyyy = date.getFullYear();
    return `${dd}.${mm}.${yyyy}`;
};

const generateSerialNumber = (): string => {
    const letters = Array.from({ length: 4 }, () =>
        String.fromCharCode(65 + Math.floor(Math.random() * 26)),
    ).join("");
    const digits = String(Math.floor(Math.random() * 100000)).padStart(5, "0");
    return `${letters} ${digits}`;
};

const register = async (event: SubmitEvent) => {
    event.preventDefault();
    const formData = new FormData(event.target as HTMLFormElement);
    const imie = formData.get("imie") as string;
    const nazwisko = formData.get("nazwisko") as string;
    const rawData = formData.get("data") as string;
    const gender = formData.get("gender") as "male" | "female";
    const password = formData.get("haslo") as string;
    const fatherName = formData.get("fatherName") as string;
    const motherName = formData.get("motherName") as string;

    const birth = formatDate(rawData);
    const pesel = generatePesel(rawData, gender);

    const updateDateObj = generateUpdateDate(rawData);
    const expDateObj = addYears(updateDateObj, 1);
    const updateDate = formatDateObj(updateDateObj);
    const expDate = formatDateObj(expDateObj);
    const assDate = updateDate;
    const serialNumber = generateSerialNumber();

    const photoFile = croppedPhotoFile.value;
    let photoPath = "";
    if (photoFile && photoFile.size > 0) {
        try {
            photoPath = await savePhoto(photoFile);
        } catch (error) {
            console.error(
                "Błąd zapisu zdjęcia:",
                error instanceof DOMException
                    ? `${error.name}: ${error.message}`
                    : error,
            );
        }
    }

    const store = await Store.load("settings.json");
    await store.set("user_photo_path", photoPath);
    await store.save();

    saveData({
        imie,
        nazwisko,
        birth,
        pesel,
        password,
        serialNumber,
        expDate,
        updateDate,
        assDate,
        fatherName,
        motherName,
    });
    router.push("/");
};
</script>

<template>
    <form @submit="register">
        <p>Imię</p>
        <input type="text" name="imie" id="imie" required />

        <p>Nazwisko</p>
        <input type="text" name="nazwisko" id="nazwisko" required />

        <p>Data urodzenia</p>
        <input type="date" name="data" id="data" required />

        <p>Photo</p>
        <input
            ref="photoInput"
            class="file-input"
            type="file"
            id="photo"
            accept="image/*"
            @change="handlePhotoUpload"
        />
        <p v-if="croppedPhotoFile" class="photo-ready">
            Photo cropped and ready
        </p>

        <div
            v-if="isCropperOpen"
            class="modal modal-open"
            role="dialog"
            aria-modal="true"
        >
            <div class="modal-box crop-modal">
                <h3>Crop photo</h3>
                <div
                    class="crop-frame"
                    @pointerdown="startCropDrag"
                    @pointermove="moveCropDrag"
                    @pointerup="endCropDrag"
                    @pointercancel="endCropDrag"
                >
                    <img
                        v-if="selectedPhotoUrl"
                        ref="cropImage"
                        :src="selectedPhotoUrl"
                        :style="cropImageStyle"
                        alt=""
                        draggable="false"
                    />
                </div>
                <label class="zoom-control" for="photoZoom">Zoom</label>
                <input
                    id="photoZoom"
                    v-model.number="cropZoom"
                    class="range"
                    type="range"
                    min="1"
                    max="3"
                    step="0.01"
                />
                <div class="modal-action">
                    <button class="btn" type="button" @click="cancelPhotoCrop">
                        Cancel
                    </button>
                    <button
                        class="btn btn-primary"
                        type="button"
                        @click="applyPhotoCrop"
                    >
                        Use photo
                    </button>
                </div>
            </div>
        </div>

        <p>Płeć</p>
        <select name="gender" id="gender">
            <option value="male">Mężczyzna</option>
            <option value="female">Kobieta</option>
        </select>

        <p>Hasło</p>
        <input type="password" name="haslo" id="haslo" required />

        <p>Imie ojca</p>
        <input type="text" name="fatherName" id="fatherName" required />
        <p>Imie matki</p>
        <input type="text" name="motherName" id="motherName" required />
        <br />
        <button type="submit">Register</button>
    </form>
</template>

<style lang="css" scoped>
.photo-ready {
    color: var(--accent-green);
    font-size: 14px;
    margin-top: 6px;
}

.crop-modal {
    max-width: 380px;
}

.crop-modal h3 {
    font-size: 18px;
    font-weight: 700;
    margin-bottom: 14px;
}

.crop-frame {
    aspect-ratio: 430/561;
    width: min(320px, 100%);
    margin: 0 auto 18px;
    position: relative;
    overflow: hidden;
    border-radius: 8px;
    background: var(--line);
    touch-action: none;
    cursor: grab;
}

.crop-frame:active {
    cursor: grabbing;
}

.crop-frame img {
    position: absolute;
    left: 50%;
    top: 50%;
    width: 100%;
    height: 100%;
    object-fit: cover;
    user-select: none;
    pointer-events: none;
}

.zoom-control {
    display: block;
    font-size: 14px;
    font-weight: 600;
    margin-bottom: 8px;
}
</style>
