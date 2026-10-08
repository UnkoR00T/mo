package org.bouncycastle.tsp.ers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ERSDirectoryDataGroup extends ERSDataGroup {
    public ERSDirectoryDataGroup(File file) {
        super(buildGroup(file));
    }

    private static List<ERSData> buildGroup(File file) {
        ERSCachingData eRSFileData;
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("file reference does not refer to directory");
        }
        File[] fileArrListFiles = file.listFiles();
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (int i15 = 0; i15 != fileArrListFiles.length; i15++) {
            if (fileArrListFiles[i15].isDirectory()) {
                if (fileArrListFiles[i15].listFiles().length != 0) {
                    eRSFileData = new ERSDirectoryDataGroup(fileArrListFiles[i15]);
                }
            } else {
                eRSFileData = new ERSFileData(fileArrListFiles[i15]);
            }
            arrayList.add(eRSFileData);
        }
        return arrayList;
    }

    public List<ERSFileData> getFiles() {
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 != this.dataObjects.size(); i15++) {
            if (this.dataObjects.get(i15) instanceof ERSFileData) {
                arrayList.add((ERSFileData) this.dataObjects.get(i15));
            }
        }
        return arrayList;
    }

    public List<ERSDirectoryDataGroup> getSubdirectories() {
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 != this.dataObjects.size(); i15++) {
            if (this.dataObjects.get(i15) instanceof ERSDirectoryDataGroup) {
                arrayList.add((ERSDirectoryDataGroup) this.dataObjects.get(i15));
            }
        }
        return arrayList;
    }
}
