package tv1;

import android.graphics.Bitmap;
import dx.i;
import gv1.BarcodeSchema;
import gv1.DocumentSchema;
import gv1.QrCodeSchema;
import gv1.s;
import iy.b0;
import java.util.LinkedHashMap;
import java.util.Map;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;
import wv1.BitmapsByFieldReference;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ltv1/a;", "", "Lev1/a;", "dynamicDocumentSchemaDecoder", "Lwz/a;", "barcodeGenerator", "<init>", "(Lev1/a;Lwz/a;)V", "Lgv1/i;", "schema", "Lgv1/t;", "jsonValue", "Lwv1/a;", "a", "(Lgv1/i;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lev1/a;", "b", "Lwz/a;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ev1.a dynamicDocumentSchemaDecoder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wz.a barcodeGenerator;

    /* JADX INFO: renamed from: tv1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5030a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192447d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192448e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f192449f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f192450g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f192451h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f192452j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f192453k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f192454l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f192456n;

        C5030a(tq.e<? super C5030a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f192454l = obj;
            this.f192456n |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, null, this);
        }
    }

    public a(ev1.a aVar, wz.a aVar2) {
        this.dynamicDocumentSchemaDecoder = aVar;
        this.barcodeGenerator = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0134  */
    /* JADX WARN: Code duplicated, block: B:42:0x0140  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(DocumentSchema documentSchema, b0 b0Var, tq.e<? super BitmapsByFieldReference> eVar) throws Throwable {
        C5030a c5030a;
        Map linkedHashMap;
        Map linkedHashMap2;
        BarcodeSchema barcode;
        DocumentSchema documentSchema2;
        b0 b0Var2;
        String strF;
        Map map;
        Map map2;
        Map map3;
        b0 b0Var3;
        QrCodeSchema qrCode;
        String strF2;
        Object objA;
        QrCodeSchema qrCodeSchema;
        Bitmap bitmap;
        if (eVar instanceof C5030a) {
            c5030a = (C5030a) eVar;
            int i15 = c5030a.f192456n;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c5030a.f192456n = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c5030a = new C5030a(eVar);
            }
        } else {
            c5030a = new C5030a(eVar);
        }
        Object obj = c5030a.f192454l;
        Object objE = uq.b.e();
        int i16 = c5030a.f192456n;
        if (i16 != 0) {
            if (i16 == 1) {
                barcode = (BarcodeSchema) c5030a.f192451h;
                map = (Map) c5030a.f192450g;
                linkedHashMap = (Map) c5030a.f192449f;
                b0 b0Var4 = (b0) c5030a.f192448e;
                documentSchema2 = (DocumentSchema) c5030a.f192447d;
                u.b(obj);
                b0Var2 = b0Var4;
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qrCodeSchema = (QrCodeSchema) c5030a.f192451h;
                map2 = (Map) c5030a.f192450g;
                map3 = (Map) c5030a.f192449f;
                u.b(obj);
            }
            bitmap = (Bitmap) ((i) obj).a();
            if (bitmap != null) {
                map2.put(qrCodeSchema.getFieldReference(), bitmap);
            }
            return new BitmapsByFieldReference(map3, map2);
        }
        u.b(obj);
        linkedHashMap = new LinkedHashMap();
        linkedHashMap2 = new LinkedHashMap();
        barcode = documentSchema.getBarcode();
        if (barcode == null || (strF = ev1.a.f(this.dynamicDocumentSchemaDecoder, s.TEXT, barcode.getFieldReference(), null, null, b0Var, null, 44, null)) == null) {
            documentSchema2 = documentSchema;
            b0Var2 = b0Var;
            map2 = linkedHashMap2;
            map3 = linkedHashMap;
            b0Var3 = b0Var2;
            qrCode = documentSchema2.getQrCode();
            if (qrCode != null && (strF2 = ev1.a.f(this.dynamicDocumentSchemaDecoder, s.TEXT, qrCode.getFieldReference(), null, null, b0Var3, null, 44, null)) != null) {
                wz.a aVar = this.barcodeGenerator;
                wz.b.QrCode qrCode2 = new wz.b.QrCode(strF2, 0, 2, null);
                c5030a.f192447d = j.a(documentSchema2);
                c5030a.f192448e = j.a(b0Var3);
                c5030a.f192449f = map3;
                c5030a.f192450g = map2;
                c5030a.f192451h = qrCode;
                c5030a.f192452j = j.a(strF2);
                c5030a.f192453k = 0;
                c5030a.f192456n = 2;
                objA = aVar.a(qrCode2, c5030a);
                if (objA != objE) {
                    qrCodeSchema = qrCode;
                    obj = objA;
                    bitmap = (Bitmap) ((i) obj).a();
                    if (bitmap != null) {
                        map2.put(qrCodeSchema.getFieldReference(), bitmap);
                    }
                }
            }
            return new BitmapsByFieldReference(map3, map2);
        }
        wz.a aVar2 = this.barcodeGenerator;
        wz.b.BarCode barCode = new wz.b.BarCode(strF, 0, 0, 6, null);
        documentSchema2 = documentSchema;
        c5030a.f192447d = documentSchema2;
        b0Var2 = b0Var;
        c5030a.f192448e = b0Var2;
        c5030a.f192449f = linkedHashMap;
        c5030a.f192450g = linkedHashMap2;
        c5030a.f192451h = barcode;
        c5030a.f192452j = j.a(strF);
        c5030a.f192453k = 0;
        c5030a.f192456n = 1;
        Object objA2 = aVar2.a(barCode, c5030a);
        if (objA2 != objE) {
            map = linkedHashMap2;
            obj = objA2;
        }
        return objE;
        Bitmap bitmap2 = (Bitmap) ((i) obj).a();
        if (bitmap2 != null) {
            linkedHashMap.put(barcode.getFieldReference(), bitmap2);
        }
        linkedHashMap2 = map;
        map2 = linkedHashMap2;
        map3 = linkedHashMap;
        b0Var3 = b0Var2;
        qrCode = documentSchema2.getQrCode();
        if (qrCode != null) {
            wz.a aVar3 = this.barcodeGenerator;
            wz.b.QrCode qrCode3 = new wz.b.QrCode(strF2, 0, 2, null);
            c5030a.f192447d = j.a(documentSchema2);
            c5030a.f192448e = j.a(b0Var3);
            c5030a.f192449f = map3;
            c5030a.f192450g = map2;
            c5030a.f192451h = qrCode;
            c5030a.f192452j = j.a(strF2);
            c5030a.f192453k = 0;
            c5030a.f192456n = 2;
            objA = aVar3.a(qrCode3, c5030a);
            if (objA != objE) {
                qrCodeSchema = qrCode;
                obj = objA;
                bitmap = (Bitmap) ((i) obj).a();
                if (bitmap != null) {
                    map2.put(qrCodeSchema.getFieldReference(), bitmap);
                }
            }
            return objE;
        }
        return new BitmapsByFieldReference(map3, map2);
    }
}
