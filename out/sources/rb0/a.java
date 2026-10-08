package rb0;

import android.graphics.Bitmap;
import iy.b0;
import java.util.LinkedHashMap;
import java.util.Map;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sb0.BitmapsByFieldReference;
import yf0.BarcodeSchema;
import yf0.DocumentSchema;
import yf0.QrCodeSchema;
import yf0.n;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lrb0/a;", "", "Lrb0/j;", "dynamicDocumentSchemaDecoder", "Lwz/a;", "barcodeGenerator", "<init>", "(Lrb0/j;Lwz/a;)V", "Lyf0/e;", "schema", "Liy/b0;", "jsonValue", "Lsb0/a;", "a", "(Lyf0/e;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lrb0/j;", "b", "Lwz/a;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j dynamicDocumentSchemaDecoder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wz.a barcodeGenerator;

    /* JADX INFO: renamed from: rb0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4409a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f172846d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f172847e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f172848f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f172849g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f172850h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f172851j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f172852k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f172853l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f172855n;

        C4409a(tq.e<? super C4409a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f172853l = obj;
            this.f172855n |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, null, this);
        }
    }

    public a(j jVar, wz.a aVar) {
        this.dynamicDocumentSchemaDecoder = jVar;
        this.barcodeGenerator = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0134  */
    /* JADX WARN: Code duplicated, block: B:42:0x0140  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(DocumentSchema documentSchema, b0 b0Var, tq.e<? super BitmapsByFieldReference> eVar) throws Throwable {
        C4409a c4409a;
        Map linkedHashMap;
        Map linkedHashMap2;
        BarcodeSchema barcode;
        DocumentSchema documentSchema2;
        b0 b0Var2;
        String strC;
        Map map;
        Map map2;
        Map map3;
        b0 b0Var3;
        QrCodeSchema qrCode;
        String strC2;
        Object objA;
        QrCodeSchema qrCodeSchema;
        Bitmap bitmap;
        if (eVar instanceof C4409a) {
            c4409a = (C4409a) eVar;
            int i15 = c4409a.f172855n;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c4409a.f172855n = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c4409a = new C4409a(eVar);
            }
        } else {
            c4409a = new C4409a(eVar);
        }
        Object obj = c4409a.f172853l;
        Object objE = uq.b.e();
        int i16 = c4409a.f172855n;
        if (i16 != 0) {
            if (i16 == 1) {
                barcode = (BarcodeSchema) c4409a.f172850h;
                map = (Map) c4409a.f172849g;
                linkedHashMap = (Map) c4409a.f172848f;
                b0 b0Var4 = (b0) c4409a.f172847e;
                documentSchema2 = (DocumentSchema) c4409a.f172846d;
                u.b(obj);
                b0Var2 = b0Var4;
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qrCodeSchema = (QrCodeSchema) c4409a.f172850h;
                map2 = (Map) c4409a.f172849g;
                map3 = (Map) c4409a.f172848f;
                u.b(obj);
            }
            bitmap = (Bitmap) ((dx.i) obj).a();
            if (bitmap != null) {
                map2.put(qrCodeSchema.getFieldReference(), bitmap);
            }
            return new BitmapsByFieldReference(map3, map2);
        }
        u.b(obj);
        linkedHashMap = new LinkedHashMap();
        linkedHashMap2 = new LinkedHashMap();
        barcode = documentSchema.getBarcode();
        if (barcode == null || (strC = j.c(this.dynamicDocumentSchemaDecoder, n.TEXT, barcode.getFieldReference(), null, null, b0Var, null, 44, null)) == null) {
            documentSchema2 = documentSchema;
            b0Var2 = b0Var;
            map2 = linkedHashMap2;
            map3 = linkedHashMap;
            b0Var3 = b0Var2;
            qrCode = documentSchema2.getQrCode();
            if (qrCode != null && (strC2 = j.c(this.dynamicDocumentSchemaDecoder, n.TEXT, qrCode.getFieldReference(), null, null, b0Var3, null, 44, null)) != null) {
                wz.a aVar = this.barcodeGenerator;
                wz.b.QrCode qrCode2 = new wz.b.QrCode(strC2, 0, 2, null);
                c4409a.f172846d = vq.j.a(documentSchema2);
                c4409a.f172847e = vq.j.a(b0Var3);
                c4409a.f172848f = map3;
                c4409a.f172849g = map2;
                c4409a.f172850h = qrCode;
                c4409a.f172851j = vq.j.a(strC2);
                c4409a.f172852k = 0;
                c4409a.f172855n = 2;
                objA = aVar.a(qrCode2, c4409a);
                if (objA != objE) {
                    qrCodeSchema = qrCode;
                    obj = objA;
                    bitmap = (Bitmap) ((dx.i) obj).a();
                    if (bitmap != null) {
                        map2.put(qrCodeSchema.getFieldReference(), bitmap);
                    }
                }
            }
            return new BitmapsByFieldReference(map3, map2);
        }
        wz.a aVar2 = this.barcodeGenerator;
        wz.b.BarCode barCode = new wz.b.BarCode(strC, 0, 0, 6, null);
        documentSchema2 = documentSchema;
        c4409a.f172846d = documentSchema2;
        b0Var2 = b0Var;
        c4409a.f172847e = b0Var2;
        c4409a.f172848f = linkedHashMap;
        c4409a.f172849g = linkedHashMap2;
        c4409a.f172850h = barcode;
        c4409a.f172851j = vq.j.a(strC);
        c4409a.f172852k = 0;
        c4409a.f172855n = 1;
        Object objA2 = aVar2.a(barCode, c4409a);
        if (objA2 != objE) {
            map = linkedHashMap2;
            obj = objA2;
        }
        return objE;
        Bitmap bitmap2 = (Bitmap) ((dx.i) obj).a();
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
            wz.b.QrCode qrCode3 = new wz.b.QrCode(strC2, 0, 2, null);
            c4409a.f172846d = vq.j.a(documentSchema2);
            c4409a.f172847e = vq.j.a(b0Var3);
            c4409a.f172848f = map3;
            c4409a.f172849g = map2;
            c4409a.f172850h = qrCode;
            c4409a.f172851j = vq.j.a(strC2);
            c4409a.f172852k = 0;
            c4409a.f172855n = 2;
            objA = aVar3.a(qrCode3, c4409a);
            if (objA != objE) {
                qrCodeSchema = qrCode;
                obj = objA;
                bitmap = (Bitmap) ((dx.i) obj).a();
                if (bitmap != null) {
                    map2.put(qrCodeSchema.getFieldReference(), bitmap);
                }
            }
            return objE;
        }
        return new BitmapsByFieldReference(map3, map2);
    }
}
