package hc4;

import android.net.Uri;
import fr.t;
import fu.r;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import mx.Label;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import wx.FileContent;
import wx.FilePickerMetadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096B¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010*¨\u0006+"}, d2 = {"Lhc4/l;", "Lbc4/l;", "Lbc4/b;", "checkFileSizeUseCase", "Lb00/g;", "mediaPickerManager", "Laz/f;", "fileDataManager", "Lmx/c;", "labelProvider", "Lbc4/o;", "rotateImageUC", "Lxx/a;", "exifDataManager", "<init>", "(Lbc4/b;Lb00/g;Laz/f;Lmx/c;Lbc4/o;Lxx/a;)V", "Ldx/i$b;", "Ldx/b$c;", "d", "()Ldx/i$b;", "h", "g", "", "Lwx/d;", "allowedExtensions", "e", "(Ljava/util/Set;)Ldx/i$b;", "Lbc4/l$b;", "params", "Ldx/i;", "Ldx/b;", "Lbc4/l$c;", "f", "(Lbc4/l$b;Ltq/e;)Ljava/lang/Object;", "a", "Lbc4/b;", "b", "Lb00/g;", "c", "Laz/f;", "Lmx/c;", "Lbc4/o;", "Lxx/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements bc4.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bc4.b checkFileSizeUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b00.g mediaPickerManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final az.f fileDataManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final bc4.o rotateImageUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xx.a exifDataManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.l<wx.d, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f83480a = new a();

        a() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ CharSequence b(wx.d dVar) {
            return c(dVar.getValue());
        }

        public final CharSequence c(String str) {
            return '.' + str;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {
        /* synthetic */ Object A;
        int C;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f83481d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f83482e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f83483f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f83484g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f83485h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f83486j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f83487k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f83488l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f83489m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f83490n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f83491p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f83492q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f83493r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f83494s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f83495t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f83496v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f83497w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f83498x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f83499y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        float f83500z;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.A = obj;
            this.C |= PKIFailureInfo.systemUnavail;
            return l.this.c(null, this);
        }
    }

    public l(bc4.b bVar, b00.g gVar, az.f fVar, mx.c cVar, bc4.o oVar, xx.a aVar) {
        this.checkFileSizeUseCase = bVar;
        this.mediaPickerManager = gVar;
        this.fileDataManager = fVar;
        this.labelProvider = cVar;
        this.rotateImageUC = oVar;
        this.exifDataManager = aVar;
    }

    private final dx.i.Left<dx.b.Business> d() {
        return new dx.i.Left<>(new dx.b.Business(zb4.b.FILE_ALREADY_PICKED, null, this.labelProvider.c(xb4.a.f217907e), this.labelProvider.c(xb4.a.f217906d), null, this.labelProvider.c(xb4.a.f217904b), null, 82, null));
    }

    private final dx.i.Left<dx.b.Business> e(Set<wx.d> allowedExtensions) {
        return new dx.i.Left<>(new dx.b.Business(null, null, this.labelProvider.c(xb4.a.f217909g), this.labelProvider.e(xb4.a.f217916n, v.v0(allowedExtensions, null, null, null, 0, null, a.f83480a, 31, null)), null, this.labelProvider.c(xb4.a.f217904b), null, 83, null));
    }

    private final dx.i.Left<dx.b.Business> g() {
        return new dx.i.Left<>(new dx.b.Business(zb4.b.NO_PHOTO_PICKED, null, Label.INSTANCE.c(), null, null, this.labelProvider.c(xb4.a.f217904b), null, 90, null));
    }

    private final dx.i.Left<dx.b.Business> h() {
        return new dx.i.Left<>(new dx.b.Business(null, null, this.labelProvider.c(xb4.a.f217926x), null, null, this.labelProvider.c(xb4.a.f217904b), null, 91, null));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:106:0x0349  */
    /* JADX WARN: Code duplicated, block: B:109:0x036b  */
    /* JADX WARN: Code duplicated, block: B:116:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:120:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:123:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:127:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:135:0x0400  */
    /* JADX WARN: Code duplicated, block: B:137:0x0404  */
    /* JADX WARN: Code duplicated, block: B:140:0x040f A[Catch: Exception -> 0x03f7, c -> 0x03fa, CancellationException -> 0x03fd, TryCatch #6 {Exception -> 0x03f7, blocks: (B:128:0x03f2, B:138:0x0405, B:140:0x040f, B:151:0x0445, B:153:0x044f, B:158:0x047f, B:155:0x045c, B:156:0x0461, B:143:0x041b, B:144:0x041f, B:146:0x0425, B:148:0x0435, B:212:0x04f3, B:215:0x0501, B:186:0x04bf, B:187:0x04c8), top: B:234:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x041b A[Catch: Exception -> 0x03f7, c -> 0x03fa, CancellationException -> 0x03fd, TryCatch #6 {Exception -> 0x03f7, blocks: (B:128:0x03f2, B:138:0x0405, B:140:0x040f, B:151:0x0445, B:153:0x044f, B:158:0x047f, B:155:0x045c, B:156:0x0461, B:143:0x041b, B:144:0x041f, B:146:0x0425, B:148:0x0435, B:212:0x04f3, B:215:0x0501, B:186:0x04bf, B:187:0x04c8), top: B:234:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0425 A[Catch: Exception -> 0x03f7, c -> 0x03fa, CancellationException -> 0x03fd, TryCatch #6 {Exception -> 0x03f7, blocks: (B:128:0x03f2, B:138:0x0405, B:140:0x040f, B:151:0x0445, B:153:0x044f, B:158:0x047f, B:155:0x045c, B:156:0x0461, B:143:0x041b, B:144:0x041f, B:146:0x0425, B:148:0x0435, B:212:0x04f3, B:215:0x0501, B:186:0x04bf, B:187:0x04c8), top: B:234:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x044f A[Catch: Exception -> 0x03f7, c -> 0x03fa, CancellationException -> 0x03fd, TryCatch #6 {Exception -> 0x03f7, blocks: (B:128:0x03f2, B:138:0x0405, B:140:0x040f, B:151:0x0445, B:153:0x044f, B:158:0x047f, B:155:0x045c, B:156:0x0461, B:143:0x041b, B:144:0x041f, B:146:0x0425, B:148:0x0435, B:212:0x04f3, B:215:0x0501, B:186:0x04bf, B:187:0x04c8), top: B:234:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x045a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x045c A[Catch: Exception -> 0x03f7, c -> 0x03fa, CancellationException -> 0x03fd, TryCatch #6 {Exception -> 0x03f7, blocks: (B:128:0x03f2, B:138:0x0405, B:140:0x040f, B:151:0x0445, B:153:0x044f, B:158:0x047f, B:155:0x045c, B:156:0x0461, B:143:0x041b, B:144:0x041f, B:146:0x0425, B:148:0x0435, B:212:0x04f3, B:215:0x0501, B:186:0x04bf, B:187:0x04c8), top: B:234:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0461 A[Catch: Exception -> 0x03f7, c -> 0x03fa, CancellationException -> 0x03fd, TryCatch #6 {Exception -> 0x03f7, blocks: (B:128:0x03f2, B:138:0x0405, B:140:0x040f, B:151:0x0445, B:153:0x044f, B:158:0x047f, B:155:0x045c, B:156:0x0461, B:143:0x041b, B:144:0x041f, B:146:0x0425, B:148:0x0435, B:212:0x04f3, B:215:0x0501, B:186:0x04bf, B:187:0x04c8), top: B:234:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x04bf A[Catch: Exception -> 0x03f7, c -> 0x03fa, CancellationException -> 0x03fd, TryCatch #6 {Exception -> 0x03f7, blocks: (B:128:0x03f2, B:138:0x0405, B:140:0x040f, B:151:0x0445, B:153:0x044f, B:158:0x047f, B:155:0x045c, B:156:0x0461, B:143:0x041b, B:144:0x041f, B:146:0x0425, B:148:0x0435, B:212:0x04f3, B:215:0x0501, B:186:0x04bf, B:187:0x04c8), top: B:234:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x050a  */
    /* JADX WARN: Code duplicated, block: B:221:0x051a  */
    /* JADX WARN: Code duplicated, block: B:222:0x0528  */
    /* JADX WARN: Code duplicated, block: B:224:0x052c  */
    /* JADX WARN: Code duplicated, block: B:227:0x0539  */
    /* JADX WARN: Code duplicated, block: B:230:0x0540  */
    /* JADX WARN: Code duplicated, block: B:232:0x0546  */
    /* JADX WARN: Code duplicated, block: B:257:0x0418 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0435 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x041f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x0205 A[Catch: Exception -> 0x0062, c -> 0x0067, CancellationException -> 0x006c, TryCatch #26 {c -> 0x0067, CancellationException -> 0x006c, Exception -> 0x0062, blocks: (B:13:0x005b, B:67:0x01fa, B:69:0x0205, B:70:0x021b), top: B:234:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x024b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x029f  */
    /* JADX WARN: Code duplicated, block: B:83:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:84:0x02c0 A[Catch: Exception -> 0x02e4, c -> 0x02eb, CancellationException -> 0x02f2, TryCatch #28 {c -> 0x02eb, CancellationException -> 0x02f2, Exception -> 0x02e4, blocks: (B:117:0x03ce, B:121:0x03d6, B:81:0x02b2, B:84:0x02c0, B:86:0x02c4, B:89:0x02d5, B:91:0x02d9, B:102:0x02fc), top: B:239:0x02b2 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x02c4 A[Catch: Exception -> 0x02e4, c -> 0x02eb, CancellationException -> 0x02f2, TRY_LEAVE, TryCatch #28 {c -> 0x02eb, CancellationException -> 0x02f2, Exception -> 0x02e4, blocks: (B:117:0x03ce, B:121:0x03d6, B:81:0x02b2, B:84:0x02c0, B:86:0x02c4, B:89:0x02d5, B:91:0x02d9, B:102:0x02fc), top: B:239:0x02b2 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x02d9 A[Catch: Exception -> 0x02e4, c -> 0x02eb, CancellationException -> 0x02f2, TryCatch #28 {c -> 0x02eb, CancellationException -> 0x02f2, Exception -> 0x02e4, blocks: (B:117:0x03ce, B:121:0x03d6, B:81:0x02b2, B:84:0x02c0, B:86:0x02c4, B:89:0x02d5, B:91:0x02d9, B:102:0x02fc), top: B:239:0x02b2 }] */
    @Override // gz.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object c(bc4.l.Params params, tq.e<? super dx.i<? extends dx.b, bc4.l.Result>> eVar) throws Throwable {
        b bVar;
        dx.j<dx.b> jVar;
        String message;
        dx.i iVarA;
        Object objB;
        bc4.l.Params params2;
        Uri uri;
        int i15;
        Float f15;
        float fFloatValue;
        dx.j<dx.b> jVarA;
        ex.a aVar;
        Float maxPhotoSizeInBytes;
        Object objB2;
        bc4.l.Params params3;
        Uri uri2;
        dx.j<dx.b> jVar2;
        int i16;
        ex.b bVar2;
        ex.b bVar3;
        int i17;
        int i18;
        int i19;
        int i25;
        int i26;
        float f16;
        int i27;
        Integer num;
        String str;
        Uri uri3;
        ex.b bVar4;
        Object objM;
        int i28;
        int i29;
        Integer num2;
        int i35;
        int i36;
        float f17;
        ex.b bVar5;
        int i37;
        int i38;
        ex.b bVar6;
        Uri uri4;
        dx.i right;
        ex.b bVar7;
        byte[] bArr;
        int i39;
        int iIntValue;
        Object objC;
        int i45;
        ex.b bVar8;
        Uri uri5;
        byte[] bArr2;
        int i46;
        dx.i iVar;
        Object obj;
        int i47;
        bc4.l.Params params4;
        float f18;
        int i48;
        int i49;
        int i55;
        dx.j<dx.b> jVar3;
        int i56;
        int i57;
        byte[] bArr3;
        bc4.l.Params params5;
        Object objF;
        byte[] bArr4;
        float f19;
        Uri uri6;
        bc4.l.Params params6;
        String str2;
        String strI1;
        l lVar;
        String text;
        String str3;
        List<wx.i.Image> listA;
        Iterator<T> it;
        wx.i.Image image;
        boolean z15;
        bc4.l.a allowedExtensions;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i58 = bVar.C;
            if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.C = i58 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objJ = bVar.A;
        Object objE = uq.b.e();
        String str4 = "";
        try {
            try {
                try {
                    try {
                        switch (bVar.C) {
                            case 0:
                                u.b(objJ);
                                b00.g gVar = this.mediaPickerManager;
                                b00.j jVar4 = b00.j.IMAGE;
                                bVar.f83481d = params;
                                bVar.C = 1;
                                objJ = gVar.j(jVar4, bVar);
                                if (objJ != objE) {
                                    params2 = params;
                                    uri = (Uri) objJ;
                                    if (uri != null) {
                                        return g();
                                    }
                                    az.f fVar = this.fileDataManager;
                                    String string = uri.toString();
                                    bVar.f83481d = params2;
                                    bVar.f83482e = uri;
                                    bVar.f83491p = 0;
                                    bVar.C = 2;
                                    objJ = fVar.k(string, bVar);
                                    if (objJ != objE) {
                                        i15 = 0;
                                        f15 = (Float) objJ;
                                        if (f15 == null) {
                                            return h();
                                        }
                                        fFloatValue = f15.floatValue();
                                        jVarA = xw.c.f221622a.a();
                                        aVar = new ex.a();
                                        maxPhotoSizeInBytes = params2.getMaxPhotoSizeInBytes();
                                        if (maxPhotoSizeInBytes != null) {
                                            aVar.a(this.checkFileSizeUseCase.a(new bc4.b.Params(fFloatValue, maxPhotoSizeInBytes.floatValue())));
                                            i0 i0Var = i0.f148189a;
                                        }
                                        xx.a aVar2 = this.exifDataManager;
                                        String string2 = uri.toString();
                                        bVar.f83481d = params2;
                                        bVar.f83482e = uri;
                                        bVar.f83483f = jVarA;
                                        bVar.f83484g = vq.j.a(aVar);
                                        bVar.f83485h = aVar;
                                        bVar.f83491p = i15;
                                        bVar.f83500z = fFloatValue;
                                        bVar.f83492q = 0;
                                        bVar.f83493r = 0;
                                        bVar.f83494s = 0;
                                        bVar.f83495t = 0;
                                        bVar.f83496v = 0;
                                        bVar.f83497w = 0;
                                        bVar.C = 3;
                                        objB2 = aVar2.b(string2, bVar);
                                        if (objB2 != objE) {
                                            Uri uri7 = uri;
                                            params3 = params2;
                                            uri2 = uri7;
                                            jVar2 = jVarA;
                                            i16 = i15;
                                            bVar2 = aVar;
                                            bVar3 = bVar2;
                                            i17 = 0;
                                            i18 = 0;
                                            i19 = 0;
                                            i25 = 0;
                                            i26 = 0;
                                            f16 = fFloatValue;
                                            objJ = objB2;
                                            i27 = 0;
                                            try {
                                                num = (Integer) objJ;
                                                str = "";
                                                try {
                                                    az.f fVar2 = this.fileDataManager;
                                                    try {
                                                        String string3 = uri2.toString();
                                                        bVar.f83481d = params3;
                                                        bVar.f83482e = uri2;
                                                        bVar.f83483f = jVar2;
                                                        uri3 = uri2;
                                                        bVar.f83484g = vq.j.a(bVar3);
                                                        bVar.f83485h = vq.j.a(bVar2);
                                                        bVar.f83486j = num;
                                                        bVar4 = bVar2;
                                                        bVar.f83487k = bVar4;
                                                        bVar.f83491p = i16;
                                                        bVar.f83500z = f16;
                                                        bVar.f83492q = i26;
                                                        bVar.f83493r = i25;
                                                        bVar.f83494s = i19;
                                                        bVar.f83495t = i18;
                                                        bVar.f83496v = i17;
                                                        bVar.f83497w = i27;
                                                        bVar.C = 4;
                                                        objM = fVar2.m(string3, bVar);
                                                        if (objM != objE) {
                                                            int i59 = i27;
                                                            i28 = i16;
                                                            i29 = i59;
                                                            num2 = num;
                                                            objJ = objM;
                                                            i35 = i19;
                                                            i36 = i26;
                                                            f17 = f16;
                                                            bVar5 = bVar4;
                                                            i37 = i25;
                                                            i38 = i18;
                                                            jVar = jVar2;
                                                            bVar6 = bVar5;
                                                            uri4 = uri3;
                                                            try {
                                                                right = (dx.i) objJ;
                                                                bVar7 = bVar6;
                                                                if (!(right instanceof dx.i.Left)) {
                                                                    if (!(right instanceof dx.i.Right)) {
                                                                        throw new oq.p();
                                                                    }
                                                                    bArr = (byte[]) ((dx.i.Right) right).b();
                                                                    i39 = i29;
                                                                    try {
                                                                        bc4.o oVar = this.rotateImageUC;
                                                                        if (num2 != null) {
                                                                            iIntValue = num2.intValue();
                                                                        } else {
                                                                            iIntValue = 0;
                                                                        }
                                                                        bc4.o.Params params7 = new bc4.o.Params(iIntValue, bArr);
                                                                        bVar.f83481d = params3;
                                                                        bVar.f83482e = uri4;
                                                                        bVar.f83483f = jVar;
                                                                        bVar.f83484g = vq.j.a(bVar3);
                                                                        bVar.f83485h = vq.j.a(bVar7);
                                                                        bVar.f83486j = vq.j.a(num2);
                                                                        bVar.f83487k = vq.j.a(right);
                                                                        bVar.f83488l = bVar5;
                                                                        bVar.f83489m = bArr;
                                                                        bVar.f83491p = i28;
                                                                        bVar.f83500z = f17;
                                                                        bVar.f83492q = i36;
                                                                        bVar.f83493r = i37;
                                                                        bVar.f83494s = i35;
                                                                        bVar.f83495t = i38;
                                                                        bVar.f83496v = i17;
                                                                        bVar.f83497w = i39;
                                                                        bVar.f83498x = 0;
                                                                        bVar.f83499y = 0;
                                                                        bVar.C = 5;
                                                                        objC = oVar.c(params7, bVar);
                                                                        objE = objE;
                                                                        if (objC != objE) {
                                                                            int i65 = i37;
                                                                            i45 = i17;
                                                                            bVar8 = bVar5;
                                                                            uri5 = uri4;
                                                                            bArr2 = bArr;
                                                                            i46 = i65;
                                                                            iVar = right;
                                                                            objJ = objC;
                                                                            obj = objE;
                                                                            i47 = i36;
                                                                            params4 = params3;
                                                                            f18 = f17;
                                                                            i48 = i38;
                                                                            i49 = i39;
                                                                            i55 = i35;
                                                                            jVar3 = jVar;
                                                                            i56 = 0;
                                                                            i57 = 0;
                                                                            try {
                                                                                bArr3 = (byte[]) ((dx.i) objJ).a();
                                                                                if (bArr3 == null) {
                                                                                    bArr3 = bArr2;
                                                                                }
                                                                                int i66 = i56;
                                                                                int i67 = i57;
                                                                                try {
                                                                                    az.f fVar3 = this.fileDataManager;
                                                                                    String string4 = uri5.toString();
                                                                                    bVar.f83481d = params4;
                                                                                    bVar.f83482e = uri5;
                                                                                    bVar.f83483f = jVar3;
                                                                                    params5 = params4;
                                                                                    bVar.f83484g = vq.j.a(bVar3);
                                                                                    bVar.f83485h = vq.j.a(bVar7);
                                                                                    bVar.f83486j = vq.j.a(num2);
                                                                                    bVar.f83487k = vq.j.a(iVar);
                                                                                    bVar.f83488l = bVar8;
                                                                                    bVar.f83489m = vq.j.a(bArr2);
                                                                                    bVar.f83490n = bArr3;
                                                                                    bVar.f83491p = i28;
                                                                                    bVar.f83500z = f18;
                                                                                    bVar.f83492q = i47;
                                                                                    bVar.f83493r = i46;
                                                                                    bVar.f83494s = i55;
                                                                                    bVar.f83495t = i48;
                                                                                    bVar.f83496v = i45;
                                                                                    bVar.f83497w = i49;
                                                                                    bVar.f83498x = i67;
                                                                                    bVar.f83499y = i66;
                                                                                    bVar.C = 6;
                                                                                    objF = fVar3.f(string4, bVar);
                                                                                    objE = obj;
                                                                                    if (objF != objE) {
                                                                                        bArr4 = bArr3;
                                                                                        objJ = objF;
                                                                                        f19 = f18;
                                                                                        jVar = jVar3;
                                                                                        uri6 = uri5;
                                                                                        params6 = params5;
                                                                                        str2 = (String) objJ;
                                                                                        strI1 = null;
                                                                                        if (str2 != null || (text = r.s1(str2, ".", null, 2, null)) == null) {
                                                                                            lVar = this;
                                                                                            try {
                                                                                                text = lVar.labelProvider.c(xb4.a.f217918p).getText();
                                                                                            } catch (ex.c e15) {
                                                                                                e = e15;
                                                                                                return new dx.i.Left((dx.b) ex.d.a(e));
                                                                                            } catch (CancellationException e16) {
                                                                                                e = e16;
                                                                                                throw e;
                                                                                            } catch (Exception e17) {
                                                                                                e = e17;
                                                                                                str4 = str;
                                                                                                px.f fVar4 = px.f.f163100a;
                                                                                                message = e.getMessage();
                                                                                                if (message == null) {
                                                                                                    message = str4;
                                                                                                }
                                                                                                fVar4.d(message, e, px.c.a(jVar));
                                                                                                iVarA = jVar.a(e);
                                                                                                if (iVarA instanceof dx.i.Left) {
                                                                                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                                                                } else {
                                                                                                    if (!(iVarA instanceof dx.i.Right)) {
                                                                                                        throw new oq.p();
                                                                                                    }
                                                                                                    objB = ((dx.i.Right) iVarA).b();
                                                                                                }
                                                                                                return new dx.i.Left(objB);
                                                                                            }
                                                                                        } else {
                                                                                            lVar = this;
                                                                                        }
                                                                                        if (str2 != null) {
                                                                                            str3 = str;
                                                                                            strI1 = r.i1(str2, ".", str3);
                                                                                        } else {
                                                                                            str3 = str;
                                                                                        }
                                                                                        if (strI1 == null) {
                                                                                            strI1 = str3;
                                                                                        }
                                                                                        listA = params6.a();
                                                                                        if ((listA instanceof Collection) || !listA.isEmpty()) {
                                                                                            it = listA.iterator();
                                                                                            while (true) {
                                                                                                if (it.hasNext()) {
                                                                                                    image = (wx.i.Image) it.next();
                                                                                                    if (!t.c(wx.j.a(image), str2) && Arrays.equals(image.getFileContent().getBytes(), bArr4)) {
                                                                                                        z15 = true;
                                                                                                    }
                                                                                                } else {
                                                                                                    z15 = false;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            z15 = false;
                                                                                        }
                                                                                        allowedExtensions = params6.getAllowedExtensions();
                                                                                        if (!bc4.m.a(allowedExtensions, strI1)) {
                                                                                            right = lVar.e(((bc4.l.a.Limited) allowedExtensions).a());
                                                                                        } else if (z15) {
                                                                                            right = lVar.d();
                                                                                        } else {
                                                                                            right = new dx.i.Right(new bc4.l.Result(new wx.i.Image(new FilePickerMetadata(text, strI1, f19, uri6.toString()), new FileContent(bArr4))));
                                                                                        }
                                                                                        bVar5 = bVar8;
                                                                                    }
                                                                                } catch (ex.c e18) {
                                                                                    e = e18;
                                                                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                                                                } catch (CancellationException e19) {
                                                                                    e = e19;
                                                                                    throw e;
                                                                                } catch (Exception e25) {
                                                                                    e = e25;
                                                                                    str4 = str;
                                                                                    jVar = jVar3;
                                                                                    px.f fVar5 = px.f.f163100a;
                                                                                    message = e.getMessage();
                                                                                    if (message == null) {
                                                                                        message = str4;
                                                                                    }
                                                                                    fVar5.d(message, e, px.c.a(jVar));
                                                                                    iVarA = jVar.a(e);
                                                                                    if (iVarA instanceof dx.i.Left) {
                                                                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                                                    } else {
                                                                                        if (!(iVarA instanceof dx.i.Right)) {
                                                                                            throw new oq.p();
                                                                                        }
                                                                                        objB = ((dx.i.Right) iVarA).b();
                                                                                    }
                                                                                    return new dx.i.Left(objB);
                                                                                }
                                                                            } catch (ex.c e26) {
                                                                                e = e26;
                                                                            } catch (CancellationException e27) {
                                                                                e = e27;
                                                                            } catch (Exception e28) {
                                                                                e = e28;
                                                                            }
                                                                        }
                                                                    } catch (ex.c e29) {
                                                                        e = e29;
                                                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                                                    } catch (CancellationException e35) {
                                                                        e = e35;
                                                                        throw e;
                                                                    } catch (Exception e36) {
                                                                        e = e36;
                                                                        str4 = str;
                                                                        px.f fVar6 = px.f.f163100a;
                                                                        message = e.getMessage();
                                                                        if (message == null) {
                                                                            message = str4;
                                                                        }
                                                                        fVar6.d(message, e, px.c.a(jVar));
                                                                        iVarA = jVar.a(e);
                                                                        if (iVarA instanceof dx.i.Left) {
                                                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                                        } else {
                                                                            if (!(iVarA instanceof dx.i.Right)) {
                                                                                throw new oq.p();
                                                                            }
                                                                            objB = ((dx.i.Right) iVarA).b();
                                                                        }
                                                                        return new dx.i.Left(objB);
                                                                    }
                                                                    break;
                                                                }
                                                                return new dx.i.Right((bc4.l.Result) bVar5.a(right));
                                                            } catch (ex.c e37) {
                                                                e = e37;
                                                            } catch (CancellationException e38) {
                                                                e = e38;
                                                            } catch (Exception e39) {
                                                                e = e39;
                                                            }
                                                        }
                                                    } catch (ex.c e45) {
                                                        e = e45;
                                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                                    } catch (CancellationException e46) {
                                                        e = e46;
                                                        throw e;
                                                    } catch (Exception e47) {
                                                        e = e47;
                                                        str4 = str;
                                                        jVar = jVar2;
                                                        px.f fVar7 = px.f.f163100a;
                                                        message = e.getMessage();
                                                        if (message == null) {
                                                            message = str4;
                                                        }
                                                        fVar7.d(message, e, px.c.a(jVar));
                                                        iVarA = jVar.a(e);
                                                        if (iVarA instanceof dx.i.Left) {
                                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                        } else {
                                                            if (!(iVarA instanceof dx.i.Right)) {
                                                                throw new oq.p();
                                                            }
                                                            objB = ((dx.i.Right) iVarA).b();
                                                        }
                                                        return new dx.i.Left(objB);
                                                    }
                                                } catch (ex.c e48) {
                                                    e = e48;
                                                } catch (CancellationException e49) {
                                                    e = e49;
                                                } catch (Exception e55) {
                                                    e = e55;
                                                }
                                            } catch (ex.c e56) {
                                                e = e56;
                                            } catch (CancellationException e57) {
                                                e = e57;
                                            } catch (Exception e58) {
                                                e = e58;
                                                str4 = "";
                                            }
                                        }
                                    }
                                }
                                return objE;
                            case 1:
                                params2 = (bc4.l.Params) bVar.f83481d;
                                u.b(objJ);
                                uri = (Uri) objJ;
                                if (uri != null) {
                                    return g();
                                }
                                az.f fVar8 = this.fileDataManager;
                                String string5 = uri.toString();
                                bVar.f83481d = params2;
                                bVar.f83482e = uri;
                                bVar.f83491p = 0;
                                bVar.C = 2;
                                objJ = fVar8.k(string5, bVar);
                                if (objJ != objE) {
                                    i15 = 0;
                                    f15 = (Float) objJ;
                                    if (f15 == null) {
                                        return h();
                                    }
                                    fFloatValue = f15.floatValue();
                                    jVarA = xw.c.f221622a.a();
                                    aVar = new ex.a();
                                    maxPhotoSizeInBytes = params2.getMaxPhotoSizeInBytes();
                                    if (maxPhotoSizeInBytes != null) {
                                        aVar.a(this.checkFileSizeUseCase.a(new bc4.b.Params(fFloatValue, maxPhotoSizeInBytes.floatValue())));
                                        i0 i0Var2 = i0.f148189a;
                                    }
                                    xx.a aVar3 = this.exifDataManager;
                                    String string6 = uri.toString();
                                    bVar.f83481d = params2;
                                    bVar.f83482e = uri;
                                    bVar.f83483f = jVarA;
                                    bVar.f83484g = vq.j.a(aVar);
                                    bVar.f83485h = aVar;
                                    bVar.f83491p = i15;
                                    bVar.f83500z = fFloatValue;
                                    bVar.f83492q = 0;
                                    bVar.f83493r = 0;
                                    bVar.f83494s = 0;
                                    bVar.f83495t = 0;
                                    bVar.f83496v = 0;
                                    bVar.f83497w = 0;
                                    bVar.C = 3;
                                    objB2 = aVar3.b(string6, bVar);
                                    if (objB2 != objE) {
                                        Uri uri8 = uri;
                                        params3 = params2;
                                        uri2 = uri8;
                                        jVar2 = jVarA;
                                        i16 = i15;
                                        bVar2 = aVar;
                                        bVar3 = bVar2;
                                        i17 = 0;
                                        i18 = 0;
                                        i19 = 0;
                                        i25 = 0;
                                        i26 = 0;
                                        f16 = fFloatValue;
                                        objJ = objB2;
                                        i27 = 0;
                                        num = (Integer) objJ;
                                        str = "";
                                        az.f fVar9 = this.fileDataManager;
                                        String string7 = uri2.toString();
                                        bVar.f83481d = params3;
                                        bVar.f83482e = uri2;
                                        bVar.f83483f = jVar2;
                                        uri3 = uri2;
                                        bVar.f83484g = vq.j.a(bVar3);
                                        bVar.f83485h = vq.j.a(bVar2);
                                        bVar.f83486j = num;
                                        bVar4 = bVar2;
                                        bVar.f83487k = bVar4;
                                        bVar.f83491p = i16;
                                        bVar.f83500z = f16;
                                        bVar.f83492q = i26;
                                        bVar.f83493r = i25;
                                        bVar.f83494s = i19;
                                        bVar.f83495t = i18;
                                        bVar.f83496v = i17;
                                        bVar.f83497w = i27;
                                        bVar.C = 4;
                                        objM = fVar9.m(string7, bVar);
                                        if (objM != objE) {
                                            int i510 = i27;
                                            i28 = i16;
                                            i29 = i510;
                                            num2 = num;
                                            objJ = objM;
                                            i35 = i19;
                                            i36 = i26;
                                            f17 = f16;
                                            bVar5 = bVar4;
                                            i37 = i25;
                                            i38 = i18;
                                            jVar = jVar2;
                                            bVar6 = bVar5;
                                            uri4 = uri3;
                                            right = (dx.i) objJ;
                                            bVar7 = bVar6;
                                            if (!(right instanceof dx.i.Left)) {
                                                if (!(right instanceof dx.i.Right)) {
                                                    throw new oq.p();
                                                }
                                                bArr = (byte[]) ((dx.i.Right) right).b();
                                                i39 = i29;
                                                bc4.o oVar2 = this.rotateImageUC;
                                                if (num2 != null) {
                                                    iIntValue = num2.intValue();
                                                } else {
                                                    iIntValue = 0;
                                                }
                                                bc4.o.Params params8 = new bc4.o.Params(iIntValue, bArr);
                                                bVar.f83481d = params3;
                                                bVar.f83482e = uri4;
                                                bVar.f83483f = jVar;
                                                bVar.f83484g = vq.j.a(bVar3);
                                                bVar.f83485h = vq.j.a(bVar7);
                                                bVar.f83486j = vq.j.a(num2);
                                                bVar.f83487k = vq.j.a(right);
                                                bVar.f83488l = bVar5;
                                                bVar.f83489m = bArr;
                                                bVar.f83491p = i28;
                                                bVar.f83500z = f17;
                                                bVar.f83492q = i36;
                                                bVar.f83493r = i37;
                                                bVar.f83494s = i35;
                                                bVar.f83495t = i38;
                                                bVar.f83496v = i17;
                                                bVar.f83497w = i39;
                                                bVar.f83498x = 0;
                                                bVar.f83499y = 0;
                                                bVar.C = 5;
                                                objC = oVar2.c(params8, bVar);
                                                objE = objE;
                                                if (objC != objE) {
                                                    int i68 = i37;
                                                    i45 = i17;
                                                    bVar8 = bVar5;
                                                    uri5 = uri4;
                                                    bArr2 = bArr;
                                                    i46 = i68;
                                                    iVar = right;
                                                    objJ = objC;
                                                    obj = objE;
                                                    i47 = i36;
                                                    params4 = params3;
                                                    f18 = f17;
                                                    i48 = i38;
                                                    i49 = i39;
                                                    i55 = i35;
                                                    jVar3 = jVar;
                                                    i56 = 0;
                                                    i57 = 0;
                                                    bArr3 = (byte[]) ((dx.i) objJ).a();
                                                    if (bArr3 == null) {
                                                        bArr3 = bArr2;
                                                    }
                                                    int i69 = i56;
                                                    int i610 = i57;
                                                    az.f fVar10 = this.fileDataManager;
                                                    String string8 = uri5.toString();
                                                    bVar.f83481d = params4;
                                                    bVar.f83482e = uri5;
                                                    bVar.f83483f = jVar3;
                                                    params5 = params4;
                                                    bVar.f83484g = vq.j.a(bVar3);
                                                    bVar.f83485h = vq.j.a(bVar7);
                                                    bVar.f83486j = vq.j.a(num2);
                                                    bVar.f83487k = vq.j.a(iVar);
                                                    bVar.f83488l = bVar8;
                                                    bVar.f83489m = vq.j.a(bArr2);
                                                    bVar.f83490n = bArr3;
                                                    bVar.f83491p = i28;
                                                    bVar.f83500z = f18;
                                                    bVar.f83492q = i47;
                                                    bVar.f83493r = i46;
                                                    bVar.f83494s = i55;
                                                    bVar.f83495t = i48;
                                                    bVar.f83496v = i45;
                                                    bVar.f83497w = i49;
                                                    bVar.f83498x = i610;
                                                    bVar.f83499y = i69;
                                                    bVar.C = 6;
                                                    objF = fVar10.f(string8, bVar);
                                                    objE = obj;
                                                    if (objF != objE) {
                                                        bArr4 = bArr3;
                                                        objJ = objF;
                                                        f19 = f18;
                                                        jVar = jVar3;
                                                        uri6 = uri5;
                                                        params6 = params5;
                                                        str2 = (String) objJ;
                                                        strI1 = null;
                                                        if (str2 != null) {
                                                            lVar = this;
                                                            text = lVar.labelProvider.c(xb4.a.f217918p).getText();
                                                        } else {
                                                            lVar = this;
                                                            text = lVar.labelProvider.c(xb4.a.f217918p).getText();
                                                        }
                                                        if (str2 != null) {
                                                            str3 = str;
                                                            strI1 = r.i1(str2, ".", str3);
                                                        } else {
                                                            str3 = str;
                                                        }
                                                        if (strI1 == null) {
                                                            strI1 = str3;
                                                        }
                                                        listA = params6.a();
                                                        if (listA instanceof Collection) {
                                                            it = listA.iterator();
                                                            while (true) {
                                                                if (it.hasNext()) {
                                                                    image = (wx.i.Image) it.next();
                                                                    if (!t.c(wx.j.a(image), str2)) {
                                                                    }
                                                                } else {
                                                                    z15 = false;
                                                                }
                                                            }
                                                        } else {
                                                            it = listA.iterator();
                                                            while (true) {
                                                                if (it.hasNext()) {
                                                                    image = (wx.i.Image) it.next();
                                                                    if (!t.c(wx.j.a(image), str2)) {
                                                                    }
                                                                } else {
                                                                    z15 = false;
                                                                }
                                                            }
                                                        }
                                                        allowedExtensions = params6.getAllowedExtensions();
                                                        if (!bc4.m.a(allowedExtensions, strI1)) {
                                                            right = lVar.e(((bc4.l.a.Limited) allowedExtensions).a());
                                                        } else if (z15) {
                                                            right = lVar.d();
                                                        } else {
                                                            right = new dx.i.Right(new bc4.l.Result(new wx.i.Image(new FilePickerMetadata(text, strI1, f19, uri6.toString()), new FileContent(bArr4))));
                                                        }
                                                        bVar5 = bVar8;
                                                    }
                                                }
                                                break;
                                            }
                                            return new dx.i.Right((bc4.l.Result) bVar5.a(right));
                                        }
                                    }
                                }
                                return objE;
                            case 2:
                                int i75 = bVar.f83491p;
                                uri = (Uri) bVar.f83482e;
                                bc4.l.Params params9 = (bc4.l.Params) bVar.f83481d;
                                u.b(objJ);
                                i15 = i75;
                                params2 = params9;
                                f15 = (Float) objJ;
                                if (f15 == null) {
                                    return h();
                                }
                                fFloatValue = f15.floatValue();
                                jVarA = xw.c.f221622a.a();
                                aVar = new ex.a();
                                maxPhotoSizeInBytes = params2.getMaxPhotoSizeInBytes();
                                if (maxPhotoSizeInBytes != null) {
                                    aVar.a(this.checkFileSizeUseCase.a(new bc4.b.Params(fFloatValue, maxPhotoSizeInBytes.floatValue())));
                                    i0 i0Var3 = i0.f148189a;
                                }
                                xx.a aVar4 = this.exifDataManager;
                                String string9 = uri.toString();
                                bVar.f83481d = params2;
                                bVar.f83482e = uri;
                                bVar.f83483f = jVarA;
                                bVar.f83484g = vq.j.a(aVar);
                                bVar.f83485h = aVar;
                                bVar.f83491p = i15;
                                bVar.f83500z = fFloatValue;
                                bVar.f83492q = 0;
                                bVar.f83493r = 0;
                                bVar.f83494s = 0;
                                bVar.f83495t = 0;
                                bVar.f83496v = 0;
                                bVar.f83497w = 0;
                                bVar.C = 3;
                                objB2 = aVar4.b(string9, bVar);
                                if (objB2 != objE) {
                                    Uri uri9 = uri;
                                    params3 = params2;
                                    uri2 = uri9;
                                    jVar2 = jVarA;
                                    i16 = i15;
                                    bVar2 = aVar;
                                    bVar3 = bVar2;
                                    i17 = 0;
                                    i18 = 0;
                                    i19 = 0;
                                    i25 = 0;
                                    i26 = 0;
                                    f16 = fFloatValue;
                                    objJ = objB2;
                                    i27 = 0;
                                    num = (Integer) objJ;
                                    str = "";
                                    az.f fVar11 = this.fileDataManager;
                                    String string10 = uri2.toString();
                                    bVar.f83481d = params3;
                                    bVar.f83482e = uri2;
                                    bVar.f83483f = jVar2;
                                    uri3 = uri2;
                                    bVar.f83484g = vq.j.a(bVar3);
                                    bVar.f83485h = vq.j.a(bVar2);
                                    bVar.f83486j = num;
                                    bVar4 = bVar2;
                                    bVar.f83487k = bVar4;
                                    bVar.f83491p = i16;
                                    bVar.f83500z = f16;
                                    bVar.f83492q = i26;
                                    bVar.f83493r = i25;
                                    bVar.f83494s = i19;
                                    bVar.f83495t = i18;
                                    bVar.f83496v = i17;
                                    bVar.f83497w = i27;
                                    bVar.C = 4;
                                    objM = fVar11.m(string10, bVar);
                                    if (objM != objE) {
                                        int i511 = i27;
                                        i28 = i16;
                                        i29 = i511;
                                        num2 = num;
                                        objJ = objM;
                                        i35 = i19;
                                        i36 = i26;
                                        f17 = f16;
                                        bVar5 = bVar4;
                                        i37 = i25;
                                        i38 = i18;
                                        jVar = jVar2;
                                        bVar6 = bVar5;
                                        uri4 = uri3;
                                        right = (dx.i) objJ;
                                        bVar7 = bVar6;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (!(right instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            bArr = (byte[]) ((dx.i.Right) right).b();
                                            i39 = i29;
                                            bc4.o oVar3 = this.rotateImageUC;
                                            if (num2 != null) {
                                                iIntValue = num2.intValue();
                                            } else {
                                                iIntValue = 0;
                                            }
                                            bc4.o.Params params10 = new bc4.o.Params(iIntValue, bArr);
                                            bVar.f83481d = params3;
                                            bVar.f83482e = uri4;
                                            bVar.f83483f = jVar;
                                            bVar.f83484g = vq.j.a(bVar3);
                                            bVar.f83485h = vq.j.a(bVar7);
                                            bVar.f83486j = vq.j.a(num2);
                                            bVar.f83487k = vq.j.a(right);
                                            bVar.f83488l = bVar5;
                                            bVar.f83489m = bArr;
                                            bVar.f83491p = i28;
                                            bVar.f83500z = f17;
                                            bVar.f83492q = i36;
                                            bVar.f83493r = i37;
                                            bVar.f83494s = i35;
                                            bVar.f83495t = i38;
                                            bVar.f83496v = i17;
                                            bVar.f83497w = i39;
                                            bVar.f83498x = 0;
                                            bVar.f83499y = 0;
                                            bVar.C = 5;
                                            objC = oVar3.c(params10, bVar);
                                            objE = objE;
                                            if (objC != objE) {
                                                int i611 = i37;
                                                i45 = i17;
                                                bVar8 = bVar5;
                                                uri5 = uri4;
                                                bArr2 = bArr;
                                                i46 = i611;
                                                iVar = right;
                                                objJ = objC;
                                                obj = objE;
                                                i47 = i36;
                                                params4 = params3;
                                                f18 = f17;
                                                i48 = i38;
                                                i49 = i39;
                                                i55 = i35;
                                                jVar3 = jVar;
                                                i56 = 0;
                                                i57 = 0;
                                                bArr3 = (byte[]) ((dx.i) objJ).a();
                                                if (bArr3 == null) {
                                                    bArr3 = bArr2;
                                                }
                                                int i612 = i56;
                                                int i613 = i57;
                                                az.f fVar12 = this.fileDataManager;
                                                String string11 = uri5.toString();
                                                bVar.f83481d = params4;
                                                bVar.f83482e = uri5;
                                                bVar.f83483f = jVar3;
                                                params5 = params4;
                                                bVar.f83484g = vq.j.a(bVar3);
                                                bVar.f83485h = vq.j.a(bVar7);
                                                bVar.f83486j = vq.j.a(num2);
                                                bVar.f83487k = vq.j.a(iVar);
                                                bVar.f83488l = bVar8;
                                                bVar.f83489m = vq.j.a(bArr2);
                                                bVar.f83490n = bArr3;
                                                bVar.f83491p = i28;
                                                bVar.f83500z = f18;
                                                bVar.f83492q = i47;
                                                bVar.f83493r = i46;
                                                bVar.f83494s = i55;
                                                bVar.f83495t = i48;
                                                bVar.f83496v = i45;
                                                bVar.f83497w = i49;
                                                bVar.f83498x = i613;
                                                bVar.f83499y = i612;
                                                bVar.C = 6;
                                                objF = fVar12.f(string11, bVar);
                                                objE = obj;
                                                if (objF != objE) {
                                                    bArr4 = bArr3;
                                                    objJ = objF;
                                                    f19 = f18;
                                                    jVar = jVar3;
                                                    uri6 = uri5;
                                                    params6 = params5;
                                                    str2 = (String) objJ;
                                                    strI1 = null;
                                                    if (str2 != null) {
                                                        lVar = this;
                                                        text = lVar.labelProvider.c(xb4.a.f217918p).getText();
                                                    } else {
                                                        lVar = this;
                                                        text = lVar.labelProvider.c(xb4.a.f217918p).getText();
                                                    }
                                                    if (str2 != null) {
                                                        str3 = str;
                                                        strI1 = r.i1(str2, ".", str3);
                                                    } else {
                                                        str3 = str;
                                                    }
                                                    if (strI1 == null) {
                                                        strI1 = str3;
                                                    }
                                                    listA = params6.a();
                                                    if (listA instanceof Collection) {
                                                        it = listA.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                image = (wx.i.Image) it.next();
                                                                if (!t.c(wx.j.a(image), str2)) {
                                                                }
                                                            } else {
                                                                z15 = false;
                                                            }
                                                        }
                                                    } else {
                                                        it = listA.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                image = (wx.i.Image) it.next();
                                                                if (!t.c(wx.j.a(image), str2)) {
                                                                }
                                                            } else {
                                                                z15 = false;
                                                            }
                                                        }
                                                    }
                                                    allowedExtensions = params6.getAllowedExtensions();
                                                    if (!bc4.m.a(allowedExtensions, strI1)) {
                                                        right = lVar.e(((bc4.l.a.Limited) allowedExtensions).a());
                                                    } else if (z15) {
                                                        right = lVar.d();
                                                    } else {
                                                        right = new dx.i.Right(new bc4.l.Result(new wx.i.Image(new FilePickerMetadata(text, strI1, f19, uri6.toString()), new FileContent(bArr4))));
                                                    }
                                                    bVar5 = bVar8;
                                                }
                                            }
                                            break;
                                        }
                                        return new dx.i.Right((bc4.l.Result) bVar5.a(right));
                                    }
                                }
                                return objE;
                            case 3:
                                int i76 = bVar.f83497w;
                                int i77 = bVar.f83496v;
                                int i78 = bVar.f83495t;
                                int i79 = bVar.f83494s;
                                int i85 = bVar.f83493r;
                                int i86 = bVar.f83492q;
                                float f25 = bVar.f83500z;
                                int i87 = bVar.f83491p;
                                ex.b bVar9 = (ex.b) bVar.f83485h;
                                ex.b bVar10 = (ex.b) bVar.f83484g;
                                jVar2 = (dx.j) bVar.f83483f;
                                Uri uri10 = (Uri) bVar.f83482e;
                                bc4.l.Params params11 = (bc4.l.Params) bVar.f83481d;
                                try {
                                    u.b(objJ);
                                    uri2 = uri10;
                                    bVar2 = bVar9;
                                    i26 = i86;
                                    i18 = i78;
                                    i16 = i87;
                                    i25 = i85;
                                    i17 = i77;
                                    params3 = params11;
                                    i19 = i79;
                                    i27 = i76;
                                    bVar3 = bVar10;
                                    f16 = f25;
                                    num = (Integer) objJ;
                                    str = "";
                                    az.f fVar13 = this.fileDataManager;
                                    String string12 = uri2.toString();
                                    bVar.f83481d = params3;
                                    bVar.f83482e = uri2;
                                    bVar.f83483f = jVar2;
                                    uri3 = uri2;
                                    bVar.f83484g = vq.j.a(bVar3);
                                    bVar.f83485h = vq.j.a(bVar2);
                                    bVar.f83486j = num;
                                    bVar4 = bVar2;
                                    bVar.f83487k = bVar4;
                                    bVar.f83491p = i16;
                                    bVar.f83500z = f16;
                                    bVar.f83492q = i26;
                                    bVar.f83493r = i25;
                                    bVar.f83494s = i19;
                                    bVar.f83495t = i18;
                                    bVar.f83496v = i17;
                                    bVar.f83497w = i27;
                                    bVar.C = 4;
                                    objM = fVar13.m(string12, bVar);
                                    if (objM != objE) {
                                        int i512 = i27;
                                        i28 = i16;
                                        i29 = i512;
                                        num2 = num;
                                        objJ = objM;
                                        i35 = i19;
                                        i36 = i26;
                                        f17 = f16;
                                        bVar5 = bVar4;
                                        i37 = i25;
                                        i38 = i18;
                                        jVar = jVar2;
                                        bVar6 = bVar5;
                                        uri4 = uri3;
                                        right = (dx.i) objJ;
                                        bVar7 = bVar6;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (!(right instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            bArr = (byte[]) ((dx.i.Right) right).b();
                                            i39 = i29;
                                            bc4.o oVar4 = this.rotateImageUC;
                                            if (num2 != null) {
                                                iIntValue = num2.intValue();
                                            } else {
                                                iIntValue = 0;
                                            }
                                            bc4.o.Params params12 = new bc4.o.Params(iIntValue, bArr);
                                            bVar.f83481d = params3;
                                            bVar.f83482e = uri4;
                                            bVar.f83483f = jVar;
                                            bVar.f83484g = vq.j.a(bVar3);
                                            bVar.f83485h = vq.j.a(bVar7);
                                            bVar.f83486j = vq.j.a(num2);
                                            bVar.f83487k = vq.j.a(right);
                                            bVar.f83488l = bVar5;
                                            bVar.f83489m = bArr;
                                            bVar.f83491p = i28;
                                            bVar.f83500z = f17;
                                            bVar.f83492q = i36;
                                            bVar.f83493r = i37;
                                            bVar.f83494s = i35;
                                            bVar.f83495t = i38;
                                            bVar.f83496v = i17;
                                            bVar.f83497w = i39;
                                            bVar.f83498x = 0;
                                            bVar.f83499y = 0;
                                            bVar.C = 5;
                                            objC = oVar4.c(params12, bVar);
                                            objE = objE;
                                            if (objC != objE) {
                                                int i614 = i37;
                                                i45 = i17;
                                                bVar8 = bVar5;
                                                uri5 = uri4;
                                                bArr2 = bArr;
                                                i46 = i614;
                                                iVar = right;
                                                objJ = objC;
                                                obj = objE;
                                                i47 = i36;
                                                params4 = params3;
                                                f18 = f17;
                                                i48 = i38;
                                                i49 = i39;
                                                i55 = i35;
                                                jVar3 = jVar;
                                                i56 = 0;
                                                i57 = 0;
                                                bArr3 = (byte[]) ((dx.i) objJ).a();
                                                if (bArr3 == null) {
                                                    bArr3 = bArr2;
                                                }
                                                int i615 = i56;
                                                int i616 = i57;
                                                az.f fVar14 = this.fileDataManager;
                                                String string13 = uri5.toString();
                                                bVar.f83481d = params4;
                                                bVar.f83482e = uri5;
                                                bVar.f83483f = jVar3;
                                                params5 = params4;
                                                bVar.f83484g = vq.j.a(bVar3);
                                                bVar.f83485h = vq.j.a(bVar7);
                                                bVar.f83486j = vq.j.a(num2);
                                                bVar.f83487k = vq.j.a(iVar);
                                                bVar.f83488l = bVar8;
                                                bVar.f83489m = vq.j.a(bArr2);
                                                bVar.f83490n = bArr3;
                                                bVar.f83491p = i28;
                                                bVar.f83500z = f18;
                                                bVar.f83492q = i47;
                                                bVar.f83493r = i46;
                                                bVar.f83494s = i55;
                                                bVar.f83495t = i48;
                                                bVar.f83496v = i45;
                                                bVar.f83497w = i49;
                                                bVar.f83498x = i616;
                                                bVar.f83499y = i615;
                                                bVar.C = 6;
                                                objF = fVar14.f(string13, bVar);
                                                objE = obj;
                                                if (objF != objE) {
                                                    bArr4 = bArr3;
                                                    objJ = objF;
                                                    f19 = f18;
                                                    jVar = jVar3;
                                                    uri6 = uri5;
                                                    params6 = params5;
                                                    str2 = (String) objJ;
                                                    strI1 = null;
                                                    if (str2 != null) {
                                                        lVar = this;
                                                        text = lVar.labelProvider.c(xb4.a.f217918p).getText();
                                                    } else {
                                                        lVar = this;
                                                        text = lVar.labelProvider.c(xb4.a.f217918p).getText();
                                                    }
                                                    if (str2 != null) {
                                                        str3 = str;
                                                        strI1 = r.i1(str2, ".", str3);
                                                    } else {
                                                        str3 = str;
                                                    }
                                                    if (strI1 == null) {
                                                        strI1 = str3;
                                                    }
                                                    listA = params6.a();
                                                    if (listA instanceof Collection) {
                                                        it = listA.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                image = (wx.i.Image) it.next();
                                                                if (!t.c(wx.j.a(image), str2)) {
                                                                }
                                                            } else {
                                                                z15 = false;
                                                            }
                                                        }
                                                    } else {
                                                        it = listA.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                image = (wx.i.Image) it.next();
                                                                if (!t.c(wx.j.a(image), str2)) {
                                                                }
                                                            } else {
                                                                z15 = false;
                                                            }
                                                        }
                                                    }
                                                    allowedExtensions = params6.getAllowedExtensions();
                                                    if (!bc4.m.a(allowedExtensions, strI1)) {
                                                        right = lVar.e(((bc4.l.a.Limited) allowedExtensions).a());
                                                    } else if (z15) {
                                                        right = lVar.d();
                                                    } else {
                                                        right = new dx.i.Right(new bc4.l.Result(new wx.i.Image(new FilePickerMetadata(text, strI1, f19, uri6.toString()), new FileContent(bArr4))));
                                                    }
                                                    bVar5 = bVar8;
                                                }
                                            }
                                            break;
                                        }
                                        return new dx.i.Right((bc4.l.Result) bVar5.a(right));
                                    }
                                    return objE;
                                } catch (ex.c e59) {
                                    e = e59;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e65) {
                                    e = e65;
                                    throw e;
                                } catch (Exception e66) {
                                    e = e66;
                                    jVar = jVar2;
                                    px.f fVar15 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = str4;
                                    }
                                    fVar15.d(message, e, px.c.a(jVar));
                                    iVarA = jVar.a(e);
                                    if (iVarA instanceof dx.i.Left) {
                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                    } else {
                                        if (!(iVarA instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                            case 4:
                                int i88 = bVar.f83497w;
                                int i89 = bVar.f83496v;
                                int i95 = bVar.f83495t;
                                int i96 = bVar.f83494s;
                                int i97 = bVar.f83493r;
                                int i98 = bVar.f83492q;
                                f17 = bVar.f83500z;
                                int i99 = bVar.f83491p;
                                bVar5 = (ex.b) bVar.f83487k;
                                Integer num3 = (Integer) bVar.f83486j;
                                bVar6 = (ex.b) bVar.f83485h;
                                ex.b bVar11 = (ex.b) bVar.f83484g;
                                dx.j<dx.b> jVar5 = (dx.j) bVar.f83483f;
                                uri3 = (Uri) bVar.f83482e;
                                bc4.l.Params params13 = (bc4.l.Params) bVar.f83481d;
                                try {
                                    u.b(objJ);
                                    bVar3 = bVar11;
                                    num2 = num3;
                                    i37 = i97;
                                    i17 = i89;
                                    params3 = params13;
                                    i36 = i98;
                                    jVar = jVar5;
                                    str = "";
                                    i35 = i96;
                                    i28 = i99;
                                    i38 = i95;
                                    i29 = i88;
                                    uri4 = uri3;
                                    right = (dx.i) objJ;
                                    bVar7 = bVar6;
                                    if (!(right instanceof dx.i.Left)) {
                                        if (!(right instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        bArr = (byte[]) ((dx.i.Right) right).b();
                                        i39 = i29;
                                        bc4.o oVar5 = this.rotateImageUC;
                                        if (num2 != null) {
                                            iIntValue = num2.intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                        bc4.o.Params params14 = new bc4.o.Params(iIntValue, bArr);
                                        bVar.f83481d = params3;
                                        bVar.f83482e = uri4;
                                        bVar.f83483f = jVar;
                                        bVar.f83484g = vq.j.a(bVar3);
                                        bVar.f83485h = vq.j.a(bVar7);
                                        bVar.f83486j = vq.j.a(num2);
                                        bVar.f83487k = vq.j.a(right);
                                        bVar.f83488l = bVar5;
                                        bVar.f83489m = bArr;
                                        bVar.f83491p = i28;
                                        bVar.f83500z = f17;
                                        bVar.f83492q = i36;
                                        bVar.f83493r = i37;
                                        bVar.f83494s = i35;
                                        bVar.f83495t = i38;
                                        bVar.f83496v = i17;
                                        bVar.f83497w = i39;
                                        bVar.f83498x = 0;
                                        bVar.f83499y = 0;
                                        bVar.C = 5;
                                        objC = oVar5.c(params14, bVar);
                                        objE = objE;
                                        if (objC != objE) {
                                            int i617 = i37;
                                            i45 = i17;
                                            bVar8 = bVar5;
                                            uri5 = uri4;
                                            bArr2 = bArr;
                                            i46 = i617;
                                            iVar = right;
                                            objJ = objC;
                                            obj = objE;
                                            i47 = i36;
                                            params4 = params3;
                                            f18 = f17;
                                            i48 = i38;
                                            i49 = i39;
                                            i55 = i35;
                                            jVar3 = jVar;
                                            i56 = 0;
                                            i57 = 0;
                                            bArr3 = (byte[]) ((dx.i) objJ).a();
                                            if (bArr3 == null) {
                                                bArr3 = bArr2;
                                            }
                                            int i618 = i56;
                                            int i619 = i57;
                                            az.f fVar16 = this.fileDataManager;
                                            String string14 = uri5.toString();
                                            bVar.f83481d = params4;
                                            bVar.f83482e = uri5;
                                            bVar.f83483f = jVar3;
                                            params5 = params4;
                                            bVar.f83484g = vq.j.a(bVar3);
                                            bVar.f83485h = vq.j.a(bVar7);
                                            bVar.f83486j = vq.j.a(num2);
                                            bVar.f83487k = vq.j.a(iVar);
                                            bVar.f83488l = bVar8;
                                            bVar.f83489m = vq.j.a(bArr2);
                                            bVar.f83490n = bArr3;
                                            bVar.f83491p = i28;
                                            bVar.f83500z = f18;
                                            bVar.f83492q = i47;
                                            bVar.f83493r = i46;
                                            bVar.f83494s = i55;
                                            bVar.f83495t = i48;
                                            bVar.f83496v = i45;
                                            bVar.f83497w = i49;
                                            bVar.f83498x = i619;
                                            bVar.f83499y = i618;
                                            bVar.C = 6;
                                            objF = fVar16.f(string14, bVar);
                                            objE = obj;
                                            if (objF != objE) {
                                                bArr4 = bArr3;
                                                objJ = objF;
                                                f19 = f18;
                                                jVar = jVar3;
                                                uri6 = uri5;
                                                params6 = params5;
                                                str2 = (String) objJ;
                                                strI1 = null;
                                                if (str2 != null) {
                                                    lVar = this;
                                                    text = lVar.labelProvider.c(xb4.a.f217918p).getText();
                                                } else {
                                                    lVar = this;
                                                    text = lVar.labelProvider.c(xb4.a.f217918p).getText();
                                                }
                                                if (str2 != null) {
                                                    str3 = str;
                                                    strI1 = r.i1(str2, ".", str3);
                                                } else {
                                                    str3 = str;
                                                }
                                                if (strI1 == null) {
                                                    strI1 = str3;
                                                }
                                                listA = params6.a();
                                                if (listA instanceof Collection) {
                                                    it = listA.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            image = (wx.i.Image) it.next();
                                                            if (!t.c(wx.j.a(image), str2)) {
                                                            }
                                                        } else {
                                                            z15 = false;
                                                        }
                                                    }
                                                } else {
                                                    it = listA.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            image = (wx.i.Image) it.next();
                                                            if (!t.c(wx.j.a(image), str2)) {
                                                            }
                                                        } else {
                                                            z15 = false;
                                                        }
                                                    }
                                                }
                                                allowedExtensions = params6.getAllowedExtensions();
                                                if (!bc4.m.a(allowedExtensions, strI1)) {
                                                    right = lVar.e(((bc4.l.a.Limited) allowedExtensions).a());
                                                } else if (z15) {
                                                    right = lVar.d();
                                                } else {
                                                    right = new dx.i.Right(new bc4.l.Result(new wx.i.Image(new FilePickerMetadata(text, strI1, f19, uri6.toString()), new FileContent(bArr4))));
                                                }
                                                bVar5 = bVar8;
                                            }
                                            break;
                                        }
                                        return objE;
                                    }
                                    return new dx.i.Right((bc4.l.Result) bVar5.a(right));
                                } catch (ex.c e67) {
                                    e = e67;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e68) {
                                    e = e68;
                                    throw e;
                                } catch (Exception e69) {
                                    e = e69;
                                    jVar = jVar5;
                                    px.f fVar17 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = str4;
                                    }
                                    fVar17.d(message, e, px.c.a(jVar));
                                    iVarA = jVar.a(e);
                                    if (iVarA instanceof dx.i.Left) {
                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                    } else {
                                        if (!(iVarA instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                            case 5:
                                int i100 = bVar.f83499y;
                                int i101 = bVar.f83498x;
                                int i102 = bVar.f83497w;
                                int i103 = bVar.f83496v;
                                int i104 = bVar.f83495t;
                                int i105 = bVar.f83494s;
                                int i106 = bVar.f83493r;
                                int i107 = bVar.f83492q;
                                f18 = bVar.f83500z;
                                i28 = bVar.f83491p;
                                byte[] bArr5 = (byte[]) bVar.f83489m;
                                ex.b bVar12 = (ex.b) bVar.f83488l;
                                dx.i iVar2 = (dx.i) bVar.f83487k;
                                Integer num4 = (Integer) bVar.f83486j;
                                ex.b bVar13 = (ex.b) bVar.f83485h;
                                ex.b bVar14 = (ex.b) bVar.f83484g;
                                dx.j<dx.b> jVar6 = (dx.j) bVar.f83483f;
                                Uri uri11 = (Uri) bVar.f83482e;
                                params4 = (bc4.l.Params) bVar.f83481d;
                                try {
                                    u.b(objJ);
                                    i56 = i100;
                                    num2 = num4;
                                    bVar7 = bVar13;
                                    iVar = iVar2;
                                    str = "";
                                    obj = objE;
                                    i47 = i107;
                                    i46 = i106;
                                    i45 = i103;
                                    jVar3 = jVar6;
                                    i48 = i104;
                                    i49 = i102;
                                    i57 = i101;
                                    bVar8 = bVar12;
                                    bVar3 = bVar14;
                                    bArr2 = bArr5;
                                    i55 = i105;
                                    uri5 = uri11;
                                    bArr3 = (byte[]) ((dx.i) objJ).a();
                                    if (bArr3 == null) {
                                        bArr3 = bArr2;
                                    }
                                    int i6110 = i56;
                                    int i6111 = i57;
                                    az.f fVar18 = this.fileDataManager;
                                    String string15 = uri5.toString();
                                    bVar.f83481d = params4;
                                    bVar.f83482e = uri5;
                                    bVar.f83483f = jVar3;
                                    params5 = params4;
                                    bVar.f83484g = vq.j.a(bVar3);
                                    bVar.f83485h = vq.j.a(bVar7);
                                    bVar.f83486j = vq.j.a(num2);
                                    bVar.f83487k = vq.j.a(iVar);
                                    bVar.f83488l = bVar8;
                                    bVar.f83489m = vq.j.a(bArr2);
                                    bVar.f83490n = bArr3;
                                    bVar.f83491p = i28;
                                    bVar.f83500z = f18;
                                    bVar.f83492q = i47;
                                    bVar.f83493r = i46;
                                    bVar.f83494s = i55;
                                    bVar.f83495t = i48;
                                    bVar.f83496v = i45;
                                    bVar.f83497w = i49;
                                    bVar.f83498x = i6111;
                                    bVar.f83499y = i6110;
                                    bVar.C = 6;
                                    objF = fVar18.f(string15, bVar);
                                    objE = obj;
                                    if (objF != objE) {
                                        bArr4 = bArr3;
                                        objJ = objF;
                                        f19 = f18;
                                        jVar = jVar3;
                                        uri6 = uri5;
                                        params6 = params5;
                                        str2 = (String) objJ;
                                        strI1 = null;
                                        if (str2 != null) {
                                            lVar = this;
                                            text = lVar.labelProvider.c(xb4.a.f217918p).getText();
                                            break;
                                        } else {
                                            lVar = this;
                                            text = lVar.labelProvider.c(xb4.a.f217918p).getText();
                                            break;
                                        }
                                        if (str2 != null) {
                                            str3 = str;
                                            strI1 = r.i1(str2, ".", str3);
                                        } else {
                                            str3 = str;
                                        }
                                        if (strI1 == null) {
                                            strI1 = str3;
                                        }
                                        listA = params6.a();
                                        if (listA instanceof Collection) {
                                            it = listA.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    image = (wx.i.Image) it.next();
                                                    if (!t.c(wx.j.a(image), str2)) {
                                                    }
                                                } else {
                                                    z15 = false;
                                                }
                                            }
                                        } else {
                                            it = listA.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    image = (wx.i.Image) it.next();
                                                    if (!t.c(wx.j.a(image), str2)) {
                                                    }
                                                } else {
                                                    z15 = false;
                                                }
                                            }
                                        }
                                        allowedExtensions = params6.getAllowedExtensions();
                                        if (!bc4.m.a(allowedExtensions, strI1)) {
                                            right = lVar.e(((bc4.l.a.Limited) allowedExtensions).a());
                                        } else if (z15) {
                                            right = lVar.d();
                                        } else {
                                            right = new dx.i.Right(new bc4.l.Result(new wx.i.Image(new FilePickerMetadata(text, strI1, f19, uri6.toString()), new FileContent(bArr4))));
                                        }
                                        bVar5 = bVar8;
                                        return new dx.i.Right((bc4.l.Result) bVar5.a(right));
                                    }
                                    return objE;
                                } catch (ex.c e75) {
                                    e = e75;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e76) {
                                    e = e76;
                                    throw e;
                                } catch (Exception e77) {
                                    e = e77;
                                    jVar = jVar6;
                                    px.f fVar19 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = str4;
                                    }
                                    fVar19.d(message, e, px.c.a(jVar));
                                    iVarA = jVar.a(e);
                                    if (iVarA instanceof dx.i.Left) {
                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                    } else {
                                        if (!(iVarA instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                            case 6:
                                f19 = bVar.f83500z;
                                bArr4 = (byte[]) bVar.f83490n;
                                bVar8 = (ex.b) bVar.f83488l;
                                jVar = (dx.j) bVar.f83483f;
                                uri6 = (Uri) bVar.f83482e;
                                params6 = (bc4.l.Params) bVar.f83481d;
                                u.b(objJ);
                                str = "";
                                str2 = (String) objJ;
                                strI1 = null;
                                if (str2 != null) {
                                    lVar = this;
                                    text = lVar.labelProvider.c(xb4.a.f217918p).getText();
                                    break;
                                } else {
                                    lVar = this;
                                    text = lVar.labelProvider.c(xb4.a.f217918p).getText();
                                    break;
                                }
                                if (str2 != null) {
                                    str3 = str;
                                    strI1 = r.i1(str2, ".", str3);
                                } else {
                                    str3 = str;
                                }
                                if (strI1 == null) {
                                    strI1 = str3;
                                }
                                listA = params6.a();
                                if (listA instanceof Collection) {
                                    it = listA.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            image = (wx.i.Image) it.next();
                                            if (!t.c(wx.j.a(image), str2)) {
                                            }
                                        } else {
                                            z15 = false;
                                        }
                                    }
                                } else {
                                    it = listA.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            image = (wx.i.Image) it.next();
                                            if (!t.c(wx.j.a(image), str2)) {
                                            }
                                        } else {
                                            z15 = false;
                                        }
                                    }
                                }
                                allowedExtensions = params6.getAllowedExtensions();
                                if (!bc4.m.a(allowedExtensions, strI1)) {
                                    right = lVar.e(((bc4.l.a.Limited) allowedExtensions).a());
                                } else if (z15) {
                                    right = lVar.d();
                                } else {
                                    right = new dx.i.Right(new bc4.l.Result(new wx.i.Image(new FilePickerMetadata(text, strI1, f19, uri6.toString()), new FileContent(bArr4))));
                                }
                                bVar5 = bVar8;
                                return new dx.i.Right((bc4.l.Result) bVar5.a(right));
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } catch (Exception e78) {
                        e = e78;
                    }
                } catch (CancellationException e79) {
                    throw e79;
                }
            } catch (ex.c e85) {
                e = e85;
            } catch (CancellationException e86) {
                throw e86;
            }
        } catch (ex.c e87) {
            e = e87;
        } catch (CancellationException e88) {
            e = e88;
        } catch (Exception e89) {
            e = e89;
        }
    }
}
