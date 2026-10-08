package hc4;

import fu.r;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wx.FileContent;
import wx.FilePickerMetadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lhc4/e;", "Lbc4/f;", "Laz/f;", "fileDataManager", "Lmx/c;", "labelProvider", "<init>", "(Laz/f;Lmx/c;)V", "Lbc4/f$a;", "params", "Ldx/i;", "Ldx/b;", "Lbc4/f$b;", "d", "(Lbc4/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Laz/f;", "b", "Lmx/c;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements bc4.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final az.f fileDataManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f83327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f83328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f83329f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f83330g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f83331h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f83332j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f83333k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f83334l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f83336n;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f83334l = obj;
            this.f83336n |= PKIFailureInfo.systemUnavail;
            return e.this.c(null, this);
        }
    }

    public e(az.f fVar, mx.c cVar) {
        this.fileDataManager = fVar;
        this.labelProvider = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x0109  */
    /* JADX WARN: Code duplicated, block: B:49:0x010e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0122  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(bc4.f.Params params, tq.e<? super dx.i<? extends dx.b, bc4.f.Result>> eVar) throws Throwable {
        a aVar;
        bc4.f.Params params2;
        String str;
        String str2;
        Float f15;
        bc4.f.Params params3;
        dx.i iVar;
        byte[] bArr;
        Float f16;
        byte[] bArr2;
        String str3;
        String text;
        float fFloatValue;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f83336n;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f83336n = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objF = aVar.f83334l;
        Object objE = uq.b.e();
        int i16 = aVar.f83336n;
        if (i16 == 0) {
            u.b(objF);
            String uri = params.getUri();
            az.f fVar = this.fileDataManager;
            aVar.f83327d = vq.j.a(params);
            aVar.f83328e = uri;
            aVar.f83336n = 1;
            Object objK = fVar.k(uri, aVar);
            if (objK != objE) {
                params2 = params;
                str = uri;
                objF = objK;
            }
            return objE;
        }
        if (i16 == 1) {
            str = (String) aVar.f83328e;
            params2 = (bc4.f.Params) aVar.f83327d;
            u.b(objF);
        } else {
            if (i16 == 2) {
                f15 = (Float) aVar.f83329f;
                str2 = (String) aVar.f83328e;
                params3 = (bc4.f.Params) aVar.f83327d;
                u.b(objF);
                iVar = (dx.i) objF;
                if (iVar instanceof dx.i.Left) {
                    return iVar;
                }
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                bArr = (byte[]) ((dx.i.Right) iVar).b();
                az.f fVar2 = this.fileDataManager;
                aVar.f83327d = vq.j.a(params3);
                aVar.f83328e = str2;
                aVar.f83329f = f15;
                aVar.f83330g = vq.j.a(iVar);
                aVar.f83331h = bArr;
                aVar.f83332j = 0;
                aVar.f83333k = 0;
                aVar.f83336n = 3;
                objF = fVar2.f(str2, aVar);
                if (objF != objE) {
                    f16 = f15;
                    bArr2 = bArr;
                }
                return objE;
            }
            if (i16 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr2 = (byte[]) aVar.f83331h;
            f16 = (Float) aVar.f83329f;
            str2 = (String) aVar.f83328e;
            u.b(objF);
        }
        str3 = (String) objF;
        if (str3 != null || (text = r.s1(str3, ".", null, 2, null)) == null) {
            text = this.labelProvider.c(xb4.a.f217917o).getText();
        }
        String strI1 = str3 != null ? r.i1(str3, ".", "") : null;
        String str4 = strI1 != null ? strI1 : "";
        if (f16 != null) {
            fFloatValue = f16.floatValue();
        } else {
            fFloatValue = Float.NaN;
        }
        return new dx.i.Right(new bc4.f.Result(new wx.i.Regular(new FilePickerMetadata(text, str4, fFloatValue, str2), new FileContent(bArr2))));
        Float f17 = (Float) objF;
        az.f fVar3 = this.fileDataManager;
        aVar.f83327d = vq.j.a(params2);
        aVar.f83328e = str;
        aVar.f83329f = f17;
        aVar.f83336n = 2;
        Object objM = fVar3.m(str, aVar);
        if (objM != objE) {
            bc4.f.Params params4 = params2;
            str2 = str;
            f15 = f17;
            objF = objM;
            params3 = params4;
            iVar = (dx.i) objF;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (iVar instanceof dx.i.Right) {
                throw new oq.p();
            }
            bArr = (byte[]) ((dx.i.Right) iVar).b();
            az.f fVar4 = this.fileDataManager;
            aVar.f83327d = vq.j.a(params3);
            aVar.f83328e = str2;
            aVar.f83329f = f15;
            aVar.f83330g = vq.j.a(iVar);
            aVar.f83331h = bArr;
            aVar.f83332j = 0;
            aVar.f83333k = 0;
            aVar.f83336n = 3;
            objF = fVar4.f(str2, aVar);
            if (objF != objE) {
                f16 = f15;
                bArr2 = bArr;
                str3 = (String) objF;
                if (str3 != null) {
                    text = this.labelProvider.c(xb4.a.f217917o).getText();
                } else {
                    text = this.labelProvider.c(xb4.a.f217917o).getText();
                }
                if (str3 != null) {
                }
                if (strI1 != null) {
                }
                if (f16 != null) {
                    fFloatValue = f16.floatValue();
                } else {
                    fFloatValue = Float.NaN;
                }
                return new dx.i.Right(new bc4.f.Result(new wx.i.Regular(new FilePickerMetadata(text, str4, fFloatValue, str2), new FileContent(bArr2))));
            }
        }
        return objE;
    }
}
