package pm;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import io.sentry.android.core.c2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public class m {
    private static final bh.i A;
    private static final bh.i B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gg.c[] f160848a = new gg.c[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final gg.c f160849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gg.c f160850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final gg.c f160851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final gg.c f160852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final gg.c f160853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final gg.c f160854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final gg.c f160855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final gg.c f160856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final gg.c f160857j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final gg.c f160858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final gg.c f160859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final gg.c f160860m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final gg.c f160861n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final gg.c f160862o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final gg.c f160863p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final gg.c f160864q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final gg.c f160865r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final gg.c f160866s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final gg.c f160867t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final gg.c f160868u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final gg.c f160869v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final gg.c f160870w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final gg.c f160871x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final gg.c f160872y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final gg.c f160873z;

    static {
        gg.c cVar = new gg.c("vision.barcode", 1L);
        f160849b = cVar;
        gg.c cVar2 = new gg.c("vision.custom.ica", 1L);
        f160850c = cVar2;
        gg.c cVar3 = new gg.c("vision.face", 1L);
        f160851d = cVar3;
        gg.c cVar4 = new gg.c("vision.ica", 1L);
        f160852e = cVar4;
        gg.c cVar5 = new gg.c("vision.ocr", 1L);
        f160853f = cVar5;
        f160854g = new gg.c("mlkit.ocr.chinese", 1L);
        f160855h = new gg.c("mlkit.ocr.common", 1L);
        f160856i = new gg.c("mlkit.ocr.devanagari", 1L);
        f160857j = new gg.c("mlkit.ocr.japanese", 1L);
        f160858k = new gg.c("mlkit.ocr.korean", 1L);
        gg.c cVar6 = new gg.c("mlkit.langid", 1L);
        f160859l = cVar6;
        gg.c cVar7 = new gg.c("mlkit.nlclassifier", 1L);
        f160860m = cVar7;
        gg.c cVar8 = new gg.c("tflite_dynamite", 1L);
        f160861n = cVar8;
        gg.c cVar9 = new gg.c("mlkit.barcode.ui", 1L);
        f160862o = cVar9;
        gg.c cVar10 = new gg.c("mlkit.smartreply", 1L);
        f160863p = cVar10;
        f160864q = new gg.c("mlkit.image.caption", 1L);
        f160865r = new gg.c("mlkit.docscan.detect", 1L);
        f160866s = new gg.c("mlkit.docscan.crop", 1L);
        f160867t = new gg.c("mlkit.docscan.enhance", 1L);
        f160868u = new gg.c("mlkit.docscan.ui", 1L);
        f160869v = new gg.c("mlkit.docscan.stain", 1L);
        f160870w = new gg.c("mlkit.docscan.shadow", 1L);
        f160871x = new gg.c("mlkit.quality.aesthetic", 1L);
        f160872y = new gg.c("mlkit.quality.technical", 1L);
        f160873z = new gg.c("mlkit.segmentation.subject", 1L);
        bh.h hVar = new bh.h();
        hVar.a("barcode", cVar);
        hVar.a("custom_ica", cVar2);
        hVar.a("face", cVar3);
        hVar.a("ica", cVar4);
        hVar.a("ocr", cVar5);
        hVar.a("langid", cVar6);
        hVar.a("nlclassifier", cVar7);
        hVar.a("tflite_dynamite", cVar8);
        hVar.a("barcode_ui", cVar9);
        hVar.a("smart_reply", cVar10);
        A = hVar.b();
        bh.h hVar2 = new bh.h();
        hVar2.a("com.google.android.gms.vision.barcode", cVar);
        hVar2.a("com.google.android.gms.vision.custom.ica", cVar2);
        hVar2.a("com.google.android.gms.vision.face", cVar3);
        hVar2.a("com.google.android.gms.vision.ica", cVar4);
        hVar2.a("com.google.android.gms.vision.ocr", cVar5);
        hVar2.a("com.google.android.gms.mlkit.langid", cVar6);
        hVar2.a("com.google.android.gms.mlkit.nlclassifier", cVar7);
        hVar2.a("com.google.android.gms.tflite_dynamite", cVar8);
        hVar2.a("com.google.android.gms.mlkit_smartreply", cVar10);
        B = hVar2.b();
    }

    @Deprecated
    public static boolean a(Context context, List<String> list) {
        if (gg.e.f().a(context) >= 221500000) {
            return b(context, f(B, list));
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                DynamiteModule.e(context, DynamiteModule.f29074b, it.next());
            }
            return true;
        } catch (DynamiteModule.a unused) {
            return false;
        }
    }

    public static boolean b(Context context, final gg.c[] cVarArr) {
        try {
            return ((mg.b) vh.o.a(mg.c.a(context).i(new hg.g() { // from class: pm.d0
                @Override // hg.g
                public final gg.c[] b() {
                    gg.c[] cVarArr2 = m.f160848a;
                    return cVarArr;
                }
            }).e(new vh.g() { // from class: pm.e0
                @Override // vh.g
                public final void c(Exception exc) {
                    c2.f("OptionalModuleUtils", "Failed to check feature availability", exc);
                }
            }))).h();
        } catch (InterruptedException | ExecutionException e15) {
            c2.f("OptionalModuleUtils", "Failed to complete the task of features availability check", e15);
            return false;
        }
    }

    @Deprecated
    public static void c(Context context, String str) {
        d(context, bh.f.k(str));
    }

    @Deprecated
    public static void d(Context context, List<String> list) {
        if (gg.e.f().a(context) >= 221500000) {
            e(context, f(A, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void e(Context context, final gg.c[] cVarArr) {
        mg.c.a(context).d(mg.f.d().a(new hg.g() { // from class: pm.b0
            @Override // hg.g
            public final gg.c[] b() {
                gg.c[] cVarArr2 = m.f160848a;
                return cVarArr;
            }
        }).b()).e(new vh.g() { // from class: pm.c0
            @Override // vh.g
            public final void c(Exception exc) {
                c2.f("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }

    private static gg.c[] f(Map map, List list) {
        gg.c[] cVarArr = new gg.c[list.size()];
        for (int i15 = 0; i15 < list.size(); i15++) {
            cVarArr[i15] = (gg.c) jg.s.l((gg.c) map.get(list.get(i15)));
        }
        return cVarArr;
    }
}
