package f6;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import r0.c0;
import x5.p;

/* JADX INFO: loaded from: classes.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c0<c, ProviderInfo> f59364a = new c0<>(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator<byte[]> f59365b = new Comparator() { // from class: f6.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.a((byte[]) obj, (byte[]) obj2);
        }
    };

    private interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    private static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentProviderClient f59366a;

        b(Context context, Uri uri) {
            this.f59366a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // f6.d.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f59366a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e15) {
                c2.h("FontsProvider", "Unable to query the content provider", e15);
                return null;
            }
        }

        @Override // f6.d.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f59366a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f59367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f59368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List<List<byte[]>> f59369c;

        c(String str, String str2, List<List<byte[]>> list) {
            this.f59367a = str;
            this.f59368b = str2;
            this.f59369c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f59367a, cVar.f59367a) && Objects.equals(this.f59368b, cVar.f59368b) && Objects.equals(this.f59369c, cVar.f59369c);
        }

        public int hashCode() {
            return Objects.hash(this.f59367a, this.f59368b, this.f59369c);
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i15 = 0; i15 < bArr.length; i15++) {
            byte b15 = bArr[i15];
            byte b16 = bArr2[i15];
            if (b15 != b16) {
                return b15 - b16;
            }
        }
        return 0;
    }

    private static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i15 = 0; i15 < list.size(); i15++) {
            if (!Arrays.equals(list.get(i15), list2.get(i15))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : w5.e.c(resources, eVar.c());
    }

    static g.a e(Context context, List<e> list, CancellationSignal cancellationSignal) {
        String strH;
        Typeface typefaceH;
        eb.a.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i15 = 0; i15 < list.size(); i15++) {
                e eVar = list.get(i15);
                if (Build.VERSION.SDK_INT < 31 || (typefaceH = p.h((strH = eVar.h()))) == null || p.j(typefaceH) == null) {
                    ProviderInfo providerInfoF = f(context.getPackageManager(), eVar, context.getResources());
                    if (providerInfoF == null) {
                        return g.a.b(1, null);
                    }
                    arrayList.add(g(context, eVar, providerInfoF.authority, cancellationSignal));
                } else {
                    arrayList.add(new g.b[]{new g.b(strH, eVar.i())});
                }
            }
            return g.a.a(0, arrayList);
        } finally {
            eb.a.f();
        }
    }

    static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) {
        eb.a.c("FontProvider.getProvider");
        try {
            List<List<byte[]>> listD = d(eVar, resources);
            c cVar = new c(eVar.e(), eVar.f(), listD);
            ProviderInfo providerInfoD = f59364a.d(cVar);
            if (providerInfoD != null) {
                eb.a.f();
                return providerInfoD;
            }
            String strE = eVar.e();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(eVar.f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + eVar.f());
            }
            List<byte[]> listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listB, f59365b);
            for (int i15 = 0; i15 < listD.size(); i15++) {
                ArrayList arrayList = new ArrayList(listD.get(i15));
                Collections.sort(arrayList, f59365b);
                if (c(listB, arrayList)) {
                    f59364a.e(cVar, providerInfoResolveContentProvider);
                    eb.a.f();
                    return providerInfoResolveContentProvider;
                }
            }
            eb.a.f();
            return null;
        } catch (Throwable th4) {
            eb.a.f();
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [f6.d$a] */
    /* JADX WARN: Type inference failed for: r16v7 */
    static g.b[] g(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        ?? r16;
        a aVar;
        boolean z15;
        eb.a.c("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            a aVarA = a.a(context, uriBuild);
            Cursor cursorB = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                eb.a.c("ContentQueryWrapper.query");
                try {
                    try {
                        cursorB = aVarA.b(uriBuild, strArr, "query = ?", new String[]{eVar.g()}, null, cancellationSignal);
                        eb.a.f();
                        if (cursorB == null || cursorB.getCount() <= 0) {
                            aVar = aVarA;
                        } else {
                            int columnIndex = cursorB.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorB.getColumnIndex("_id");
                            int columnIndex3 = cursorB.getColumnIndex("file_id");
                            int columnIndex4 = cursorB.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursorB.getColumnIndex("font_weight");
                            int columnIndex6 = cursorB.getColumnIndex("font_italic");
                            while (cursorB.moveToNext()) {
                                int i15 = columnIndex != -1 ? cursorB.getInt(columnIndex) : 0;
                                int i16 = columnIndex4 != -1 ? cursorB.getInt(columnIndex4) : 0;
                                Uri uriWithAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorB.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorB.getLong(columnIndex3));
                                int i17 = columnIndex5 != -1 ? cursorB.getInt(columnIndex5) : 400;
                                if (columnIndex6 != -1) {
                                    z15 = true;
                                    if (cursorB.getInt(columnIndex6) != 1) {
                                        z15 = false;
                                    }
                                } else {
                                    z15 = false;
                                }
                                arrayList2.add(g.b.a(uriWithAppendedId, i16, i17, z15, i15));
                                aVarA = aVarA;
                            }
                            aVar = aVarA;
                            arrayList = arrayList2;
                        }
                        if (cursorB != null) {
                            cursorB.close();
                        }
                        aVar.close();
                        return (g.b[]) arrayList.toArray(new g.b[0]);
                    } finally {
                        eb.a.f();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r16 = context;
                    if (cursorB != null) {
                        cursorB.close();
                    }
                    r16.close();
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                r16 = aVarA;
            }
        } catch (Throwable th6) {
            eb.a.f();
            throw th6;
        }
    }
}
