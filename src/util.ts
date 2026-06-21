import { remove, BaseDirectory } from "@tauri-apps/plugin-fs";
import { exit } from "@tauri-apps/plugin-process";
import { Store } from "@tauri-apps/plugin-store";

type dataFormat = {
  imie: string;
  nazwisko: string;
  birth: string;
  pesel: string;
  password: string;
  serialNumber: string;
  expDate: string;
  updateDate: string;
  assDate: string;
  fatherName: string;
  motherName: string;
};

let localData: dataFormat | null = null;
let storePromise: Promise<Store> | null = null;

const getStore = () => {
  if (!storePromise) storePromise = Store.load("settings.json");
  return storePromise;
};

const loadData = async (): Promise<dataFormat | null> => {
  if (localData) return localData;
  const store = await getStore();
  const data = await store.get<dataFormat>("user_data");
  if (data) localData = data;
  return data ?? null;
};

const saveData = async (data: dataFormat): Promise<void> => {
  localData = data;
  const store = await getStore();
  await store.set("user_data", data);
  await store.save();
};

const clearData = async (): Promise<void> => {
  const store = await getStore();
  const photoPath = await store.get<string>("user_photo_path");

  if (photoPath) {
    try {
      await remove(photoPath, { baseDir: BaseDirectory.AppData });
    } catch (error) {
      console.error("Błąd usuwania zdjęcia:", error);
    }
  }

  await store.clear();
  await store.save();
  localData = null;
};

const clearDataAndExit = async (): Promise<void> => {
  await clearData();
  await exit(0);
};

export { loadData, saveData, clearData, clearDataAndExit, type dataFormat };
