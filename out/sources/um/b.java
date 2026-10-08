package um;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import ch.ck;
import ch.f1;
import ch.kf;
import ch.lf;
import ch.mk;
import ch.nk;
import ch.pf;
import ch.qk;
import ch.tj;
import ch.uj;
import ch.we;
import ch.wj;
import ch.xe;
import ch.ye;
import ch.ze;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseArray f199013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseArray f199014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final AtomicReference f199015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"UseSparseArrays"})
    private static final Map f199016d;

    static {
        SparseArray sparseArray = new SparseArray();
        f199013a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f199014b = sparseArray2;
        f199015c = new AtomicReference();
        sparseArray.put(-1, kf.FORMAT_UNKNOWN);
        sparseArray.put(1, kf.FORMAT_CODE_128);
        sparseArray.put(2, kf.FORMAT_CODE_39);
        sparseArray.put(4, kf.FORMAT_CODE_93);
        sparseArray.put(8, kf.FORMAT_CODABAR);
        sparseArray.put(16, kf.FORMAT_DATA_MATRIX);
        sparseArray.put(32, kf.FORMAT_EAN_13);
        sparseArray.put(64, kf.FORMAT_EAN_8);
        sparseArray.put(128, kf.FORMAT_ITF);
        sparseArray.put(256, kf.FORMAT_QR_CODE);
        sparseArray.put(512, kf.FORMAT_UPC_A);
        sparseArray.put(1024, kf.FORMAT_UPC_E);
        sparseArray.put(2048, kf.FORMAT_PDF417);
        sparseArray.put(PKIFailureInfo.certConfirmed, kf.FORMAT_AZTEC);
        sparseArray2.put(0, lf.TYPE_UNKNOWN);
        sparseArray2.put(1, lf.TYPE_CONTACT_INFO);
        sparseArray2.put(2, lf.TYPE_EMAIL);
        sparseArray2.put(3, lf.TYPE_ISBN);
        sparseArray2.put(4, lf.TYPE_PHONE);
        sparseArray2.put(5, lf.TYPE_PRODUCT);
        sparseArray2.put(6, lf.TYPE_SMS);
        sparseArray2.put(7, lf.TYPE_TEXT);
        sparseArray2.put(8, lf.TYPE_URL);
        sparseArray2.put(9, lf.TYPE_WIFI);
        sparseArray2.put(10, lf.TYPE_GEO);
        sparseArray2.put(11, lf.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, lf.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        f199016d = map;
        map.put(1, tj.CODE_128);
        map.put(2, tj.CODE_39);
        map.put(4, tj.CODE_93);
        map.put(8, tj.CODABAR);
        map.put(16, tj.DATA_MATRIX);
        map.put(32, tj.EAN_13);
        map.put(64, tj.EAN_8);
        map.put(128, tj.ITF);
        map.put(256, tj.QR_CODE);
        map.put(512, tj.UPC_A);
        map.put(1024, tj.UPC_E);
        map.put(2048, tj.PDF417);
        map.put(Integer.valueOf(PKIFailureInfo.certConfirmed), tj.AZTEC);
    }

    public static kf a(int i15) {
        kf kfVar = (kf) f199013a.get(i15);
        return kfVar == null ? kf.FORMAT_UNKNOWN : kfVar;
    }

    public static lf b(int i15) {
        lf lfVar = (lf) f199014b.get(i15);
        return lfVar == null ? lf.TYPE_UNKNOWN : lfVar;
    }

    public static wj c(rm.b bVar) {
        int iA = bVar.a();
        f1 f1Var = new f1();
        if (iA == 0) {
            f1Var.f(f199016d.values());
        } else {
            for (Map.Entry entry : f199016d.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & iA) != 0) {
                    f1Var.e((tj) entry.getValue());
                }
            }
        }
        uj ujVar = new uj();
        ujVar.b(f1Var.g());
        return ujVar.c();
    }

    public static String d() {
        return true != f() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    static void e(nk nkVar, final xe xeVar) {
        nkVar.f(new mk() { // from class: um.a
            @Override // ch.mk
            public final ck zza() {
                ze zeVar = new ze();
                we weVar = b.f() ? we.TYPE_THICK : we.TYPE_THIN;
                xe xeVar2 = xeVar;
                zeVar.e(weVar);
                pf pfVar = new pf();
                pfVar.b(xeVar2);
                zeVar.h(pfVar.c());
                return qk.a(zeVar);
            }
        }, ye.ON_DEVICE_BARCODE_LOAD);
    }

    static boolean f() {
        AtomicReference atomicReference = f199015c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zC = n.c(pm.i.c().b());
        atomicReference.set(Boolean.valueOf(zC));
        return zC;
    }
}
