<script setup lang="ts">
import { Store } from "@tauri-apps/plugin-store";
import { writeFile, mkdir, BaseDirectory } from "@tauri-apps/plugin-fs";
import { useRouter } from "vue-router";
import { saveData } from "@/util";

const router = useRouter();

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

    const photoFile = formData.get("photo") as File;
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
        <input type="file" name="photo" id="photo" accept="image/*" />

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
/* Twoje style */
</style>
