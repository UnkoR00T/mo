package com.google.android.gms.internal.oss_licenses;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class k4 {
    public static ArrayList a(Context context, int i15) {
        String[] strArrSplit = c(context.getApplicationContext(), "third_party_license_metadata", 0L, -1, i15).split("\n");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str : strArrSplit) {
            int iIndexOf = str.indexOf(32);
            String[] strArrSplit2 = str.substring(0, iIndexOf).split(":");
            if (strArrSplit2.length != 2 || iIndexOf <= 0) {
                throw new IllegalStateException(h0.a("Invalid license meta-data line:\n%s", str));
            }
            arrayList.add(j4.b(str.substring(iIndexOf + 1), Long.parseLong(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1])));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static String b(Context context, j4 j4Var, int i15) {
        return c(context, "third_party_licenses", j4Var.g(), j4Var.j(), i15);
    }

    @SuppressLint({"DiscouragedApi"})
    private static String c(Context context, String str, long j15, int i15, int i16) {
        Resources resources = context.getApplicationContext().getResources();
        InputStream inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(i16)));
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStreamOpenRawResource.skip(j15);
            if (i15 <= 0) {
                i15 = Integer.MAX_VALUE;
            }
            while (i15 > 0) {
                int i17 = inputStreamOpenRawResource.read(bArr, 0, Math.min(i15, 1024));
                if (i17 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i17);
                i15 -= i17;
            }
            inputStreamOpenRawResource.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e15) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e15);
            }
        } catch (IOException e16) {
            throw new RuntimeException("Failed to read license or metadata text.", e16);
        }
    }
}
