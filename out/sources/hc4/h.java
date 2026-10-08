package hc4;

import android.net.Uri;
import fr.t;
import fu.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import mx.Label;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import wx.FileContent;
import wx.FilePickerMetadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096B¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lhc4/h;", "Lbc4/i;", "Lzz/b;", "filePickerManager", "Laz/f;", "fileManager", "Lmx/c;", "labelProvider", "Lbc4/b;", "checkFileSizeUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "<init>", "(Lzz/b;Laz/f;Lmx/c;Lbc4/b;Lac4/a;)V", "Ldx/b$c;", "u", "()Ldx/b$c;", "t", "o", "p", "n", "s", "", "maxFileSizeInMB", "r", "(I)Ldx/b$c;", "Lbc4/i$a;", "params", "Ldx/i;", "Ldx/b;", "Lbc4/i$b;", "q", "(Lbc4/i$a;Ltq/e;)Ljava/lang/Object;", "a", "Lzz/b;", "b", "Laz/f;", "c", "Lmx/c;", "d", "Lbc4/b;", "e", "Lac4/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements bc4.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zz.b filePickerManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final az.f fileManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bc4.b checkFileSizeUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lbc4/i$b;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends bc4.i.Result>>, Object> {
        int A;
        float B;
        int C;
        final /* synthetic */ bc4.i.Params E;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f83378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f83379f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f83380g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f83381h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f83382j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f83383k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f83384l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f83385m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f83386n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f83387p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f83388q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f83389r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f83390s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f83391t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f83392v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f83393w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f83394x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f83395y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f83396z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(bc4.i.Params params, tq.e<? super a> eVar) {
            super(1, eVar);
            this.E = params;
        }

        /* JADX WARN: Code duplicated, block: B:104:0x0397  */
        /* JADX WARN: Code duplicated, block: B:107:0x03a4 A[Catch: Exception -> 0x03c5, c -> 0x03c8, CancellationException -> 0x03cb, TryCatch #32 {Exception -> 0x03c5, blocks: (B:105:0x039c, B:107:0x03a4, B:114:0x03ce, B:115:0x03da, B:175:0x04cd, B:178:0x04dc), top: B:194:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:114:0x03ce A[Catch: Exception -> 0x03c5, c -> 0x03c8, CancellationException -> 0x03cb, TryCatch #32 {Exception -> 0x03c5, blocks: (B:105:0x039c, B:107:0x03a4, B:114:0x03ce, B:115:0x03da, B:175:0x04cd, B:178:0x04dc), top: B:194:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:128:0x03f6  */
        /* JADX WARN: Code duplicated, block: B:131:0x03fe A[Catch: Exception -> 0x03db, c -> 0x03e0, CancellationException -> 0x03e5, TryCatch #14 {c -> 0x03e0, CancellationException -> 0x03e5, Exception -> 0x03db, blocks: (B:100:0x034e, B:129:0x03f8, B:130:0x03fd, B:131:0x03fe, B:132:0x0421, B:133:0x0422, B:134:0x0430, B:135:0x0431, B:136:0x043f, B:137:0x0440, B:138:0x044e, B:139:0x044f, B:140:0x045d), top: B:210:0x0289 }] */
        /* JADX WARN: Code duplicated, block: B:133:0x0422 A[Catch: Exception -> 0x03db, c -> 0x03e0, CancellationException -> 0x03e5, TryCatch #14 {c -> 0x03e0, CancellationException -> 0x03e5, Exception -> 0x03db, blocks: (B:100:0x034e, B:129:0x03f8, B:130:0x03fd, B:131:0x03fe, B:132:0x0421, B:133:0x0422, B:134:0x0430, B:135:0x0431, B:136:0x043f, B:137:0x0440, B:138:0x044e, B:139:0x044f, B:140:0x045d), top: B:210:0x0289 }] */
        /* JADX WARN: Code duplicated, block: B:135:0x0431 A[Catch: Exception -> 0x03db, c -> 0x03e0, CancellationException -> 0x03e5, TryCatch #14 {c -> 0x03e0, CancellationException -> 0x03e5, Exception -> 0x03db, blocks: (B:100:0x034e, B:129:0x03f8, B:130:0x03fd, B:131:0x03fe, B:132:0x0421, B:133:0x0422, B:134:0x0430, B:135:0x0431, B:136:0x043f, B:137:0x0440, B:138:0x044e, B:139:0x044f, B:140:0x045d), top: B:210:0x0289 }] */
        /* JADX WARN: Code duplicated, block: B:137:0x0440 A[Catch: Exception -> 0x03db, c -> 0x03e0, CancellationException -> 0x03e5, TryCatch #14 {c -> 0x03e0, CancellationException -> 0x03e5, Exception -> 0x03db, blocks: (B:100:0x034e, B:129:0x03f8, B:130:0x03fd, B:131:0x03fe, B:132:0x0421, B:133:0x0422, B:134:0x0430, B:135:0x0431, B:136:0x043f, B:137:0x0440, B:138:0x044e, B:139:0x044f, B:140:0x045d), top: B:210:0x0289 }] */
        /* JADX WARN: Code duplicated, block: B:139:0x044f A[Catch: Exception -> 0x03db, c -> 0x03e0, CancellationException -> 0x03e5, TryCatch #14 {c -> 0x03e0, CancellationException -> 0x03e5, Exception -> 0x03db, blocks: (B:100:0x034e, B:129:0x03f8, B:130:0x03fd, B:131:0x03fe, B:132:0x0421, B:133:0x0422, B:134:0x0430, B:135:0x0431, B:136:0x043f, B:137:0x0440, B:138:0x044e, B:139:0x044f, B:140:0x045d), top: B:210:0x0289 }] */
        /* JADX WARN: Code duplicated, block: B:159:0x0485  */
        /* JADX WARN: Code duplicated, block: B:181:0x04e5  */
        /* JADX WARN: Code duplicated, block: B:182:0x04e8  */
        /* JADX WARN: Code duplicated, block: B:185:0x04f8  */
        /* JADX WARN: Code duplicated, block: B:186:0x0506  */
        /* JADX WARN: Code duplicated, block: B:188:0x050a  */
        /* JADX WARN: Code duplicated, block: B:191:0x0516  */
        /* JADX WARN: Code duplicated, block: B:196:0x028b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:199:0x02a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:205:0x021d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:211:0x02b2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:212:0x02fe A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x0273  */
        /* JADX WARN: Code duplicated, block: B:70:0x0299 A[Catch: Exception -> 0x03ea, c -> 0x03ee, CancellationException -> 0x03f2, TRY_LEAVE, TryCatch #24 {c -> 0x03ee, CancellationException -> 0x03f2, Exception -> 0x03ea, blocks: (B:68:0x028b, B:70:0x0299, B:89:0x0305, B:94:0x0318, B:96:0x0331, B:98:0x0335, B:81:0x02c0, B:82:0x02c4), top: B:196:0x028b }] */
        /* JADX WARN: Code duplicated, block: B:74:0x02b2 A[EDGE_INSN: B:74:0x02b2->B:88:0x0303 BREAK  A[LOOP:0: B:82:0x02c4->B:87:0x0300]] */
        /* JADX WARN: Code duplicated, block: B:81:0x02c0 A[Catch: Exception -> 0x03ea, c -> 0x03ee, CancellationException -> 0x03f2, TRY_ENTER, TryCatch #24 {c -> 0x03ee, CancellationException -> 0x03f2, Exception -> 0x03ea, blocks: (B:68:0x028b, B:70:0x0299, B:89:0x0305, B:94:0x0318, B:96:0x0331, B:98:0x0335, B:81:0x02c0, B:82:0x02c4), top: B:196:0x028b }] */
        /* JADX WARN: Code duplicated, block: B:84:0x02ca A[Catch: Exception -> 0x02b4, c -> 0x02b8, CancellationException -> 0x02bc, TRY_ENTER, TRY_LEAVE, TryCatch #21 {c -> 0x02b8, CancellationException -> 0x02bc, Exception -> 0x02b4, blocks: (B:72:0x02a9, B:84:0x02ca), top: B:199:0x02a9 }] */
        /* JADX WARN: Code duplicated, block: B:87:0x0300 A[LOOP:0: B:82:0x02c4->B:87:0x0300, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:89:0x0305 A[Catch: Exception -> 0x03ea, c -> 0x03ee, CancellationException -> 0x03f2, TRY_ENTER, TryCatch #24 {c -> 0x03ee, CancellationException -> 0x03f2, Exception -> 0x03ea, blocks: (B:68:0x028b, B:70:0x0299, B:89:0x0305, B:94:0x0318, B:96:0x0331, B:98:0x0335, B:81:0x02c0, B:82:0x02c4), top: B:196:0x028b }] */
        /* JADX WARN: Code duplicated, block: B:91:0x0313  */
        /* JADX WARN: Code duplicated, block: B:92:0x0315  */
        /* JADX WARN: Code duplicated, block: B:94:0x0318 A[Catch: Exception -> 0x03ea, c -> 0x03ee, CancellationException -> 0x03f2, TryCatch #24 {c -> 0x03ee, CancellationException -> 0x03f2, Exception -> 0x03ea, blocks: (B:68:0x028b, B:70:0x0299, B:89:0x0305, B:94:0x0318, B:96:0x0331, B:98:0x0335, B:81:0x02c0, B:82:0x02c4), top: B:196:0x028b }] */
        /* JADX WARN: Code duplicated, block: B:96:0x0331 A[Catch: Exception -> 0x03ea, c -> 0x03ee, CancellationException -> 0x03f2, TryCatch #24 {c -> 0x03ee, CancellationException -> 0x03f2, Exception -> 0x03ea, blocks: (B:68:0x028b, B:70:0x0299, B:89:0x0305, B:94:0x0318, B:96:0x0331, B:98:0x0335, B:81:0x02c0, B:82:0x02c4), top: B:196:0x028b }] */
        /* JADX WARN: Code duplicated, block: B:98:0x0335 A[Catch: Exception -> 0x03ea, c -> 0x03ee, CancellationException -> 0x03f2, TRY_LEAVE, TryCatch #24 {c -> 0x03ee, CancellationException -> 0x03f2, Exception -> 0x03ea, blocks: (B:68:0x028b, B:70:0x0299, B:89:0x0305, B:94:0x0318, B:96:0x0331, B:98:0x0335, B:81:0x02c0, B:82:0x02c4), top: B:196:0x028b }] */
        /* JADX WARN: Instruction removed from duplicated block: B:84:0x02ca, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v7, types: [ex.b] */
        /* JADX WARN: Type inference failed for: r15v15 */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v4, types: [ex.b] */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v28, types: [ex.b] */
        /* JADX WARN: Type inference failed for: r2v33 */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v15, types: [ex.b, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v19 */
        /* JADX WARN: Type inference failed for: r7v29 */
        /* JADX WARN: Type inference failed for: r7v32 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v41 */
        /* JADX WARN: Type inference failed for: r7v42 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String str;
            String message;
            String str2;
            dx.i iVarA;
            Object objB;
            h hVar;
            Object objI;
            dx.j<dx.b> jVar;
            ex.b bVar;
            ex.b bVar2;
            bc4.i.Params params;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            zz.e eVar;
            ex.b bVar3;
            int i25;
            Object objF;
            int i26;
            Object obj2;
            zz.e eVar2;
            Uri uri;
            int i27;
            int i28;
            int i29;
            int i35;
            int i36;
            h hVar2;
            Object obj3;
            String str3;
            zz.e eVar3;
            String strS1;
            String strI1;
            h hVar3;
            Object obj4;
            dx.j<dx.b> jVar2;
            Uri uri2;
            Object objK;
            String str4;
            int i37;
            int i38;
            String str5;
            String str6;
            int i39;
            Uri uri3;
            zz.e eVar4;
            ex.b bVar4;
            h hVar4;
            dx.j<dx.b> jVar3;
            bc4.i.Params params2;
            ?? r15;
            ?? r16;
            float fFloatValue;
            List<wx.i> listA;
            int i45;
            boolean z15;
            boolean z16;
            String str7;
            dx.i<? extends dx.b, ? extends i0> iVarA2;
            Object objM;
            ?? r17;
            h hVar5;
            String str8;
            Iterator it;
            wx.i iVar;
            Iterator it4;
            Object objA;
            Object objE = uq.b.e();
            int i46 = this.C;
            ?? r18 = 2;
            r18 = 2;
            try {
                try {
                    try {
                        try {
                            if (i46 == 0) {
                                u.b(obj);
                                hVar = h.this;
                                bc4.i.Params params3 = this.E;
                                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                                ex.a aVar = new ex.a();
                                zz.b bVar5 = hVar.filePickerManager;
                                List<wx.f> listB = params3.b();
                                this.f83378e = hVar;
                                this.f83379f = params3;
                                this.f83380g = jVarA;
                                this.f83381h = vq.j.a(aVar);
                                this.f83382j = aVar;
                                this.f83390s = 0;
                                this.f83391t = 0;
                                this.f83392v = 0;
                                this.f83393w = 0;
                                this.f83394x = 0;
                                this.C = 1;
                                objI = bVar5.i(listB, this);
                                if (objI != objE) {
                                    jVar = jVarA;
                                    bVar = aVar;
                                    bVar2 = bVar;
                                    params = params3;
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                    i18 = 0;
                                    i19 = 0;
                                }
                                return objE;
                            }
                            if (i46 == 1) {
                                int i47 = this.f83394x;
                                int i48 = this.f83393w;
                                int i49 = this.f83392v;
                                int i55 = this.f83391t;
                                int i56 = this.f83390s;
                                ex.b bVar6 = (ex.b) this.f83382j;
                                ex.b bVar7 = (ex.b) this.f83381h;
                                jVar = (dx.j) this.f83380g;
                                bc4.i.Params params4 = (bc4.i.Params) this.f83379f;
                                h hVar6 = (h) this.f83378e;
                                try {
                                    u.b(obj);
                                    bVar2 = bVar6;
                                    params = params4;
                                    i17 = i49;
                                    i19 = i56;
                                    i15 = i47;
                                    hVar = hVar6;
                                    bVar = bVar7;
                                    i18 = i55;
                                    i16 = i48;
                                    objI = obj;
                                } catch (ex.c e15) {
                                    e = e15;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e16) {
                                    e = e16;
                                    throw e;
                                } catch (Exception e17) {
                                    e = e17;
                                    str = "";
                                    r18 = jVar;
                                    px.f fVar = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        str2 = str;
                                    } else {
                                        str2 = message;
                                    }
                                    fVar.d(str2, e, px.c.a(r18));
                                    iVarA = r18.a(e);
                                    if (iVarA instanceof dx.i.Left) {
                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                    } else {
                                        if (iVarA instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                            } else if (i46 == 2) {
                                int i57 = this.f83395y;
                                int i58 = this.f83394x;
                                int i59 = this.f83393w;
                                int i65 = this.f83392v;
                                int i66 = this.f83391t;
                                int i67 = this.f83390s;
                                ex.b bVar8 = (ex.b) this.f83385m;
                                Uri uri4 = (Uri) this.f83384l;
                                eVar2 = (zz.e) this.f83383k;
                                ex.b bVar9 = (ex.b) this.f83382j;
                                ex.b bVar10 = (ex.b) this.f83381h;
                                dx.j<dx.b> jVar4 = (dx.j) this.f83380g;
                                bc4.i.Params params5 = (bc4.i.Params) this.f83379f;
                                h hVar7 = (h) this.f83378e;
                                u.b(obj);
                                bVar3 = bVar10;
                                i35 = i57;
                                obj3 = bVar8;
                                obj2 = bVar9;
                                params = params5;
                                i27 = i66;
                                i29 = i65;
                                i36 = i59;
                                i28 = i58;
                                objF = obj;
                                uri = uri4;
                                i26 = i67;
                                jVar = jVar4;
                                hVar2 = hVar7;
                                i25 = 2;
                                try {
                                    if (objF != null) {
                                        obj3.b(hVar2.u());
                                        throw new oq.g();
                                    }
                                    try {
                                        str3 = (String) objF;
                                        eVar3 = eVar2;
                                        strS1 = r.s1(str3, ".", null, i25, null);
                                        strI1 = r.i1(str3, ".", "");
                                        az.f fVar2 = hVar2.fileManager;
                                        str = "";
                                        try {
                                            String string = uri.toString();
                                            this.f83378e = hVar2;
                                            this.f83379f = params;
                                            this.f83380g = jVar;
                                            hVar3 = hVar2;
                                            this.f83381h = vq.j.a(bVar3);
                                            obj4 = obj2;
                                            this.f83382j = obj4;
                                            jVar2 = jVar;
                                            this.f83383k = vq.j.a(eVar3);
                                            uri2 = uri;
                                            this.f83384l = uri2;
                                            this.f83385m = strS1;
                                            this.f83386n = strI1;
                                            this.f83387p = obj4;
                                            this.f83388q = str3;
                                            this.f83390s = i26;
                                            this.f83391t = i27;
                                            this.f83392v = i29;
                                            this.f83393w = i36;
                                            this.f83394x = i28;
                                            this.f83395y = i35;
                                            this.C = 3;
                                            objK = fVar2.k(string, this);
                                            if (objK != objE) {
                                                str4 = strS1;
                                                obj = objK;
                                                i37 = i26;
                                                i38 = i27;
                                                str5 = str3;
                                                str6 = strI1;
                                                i39 = i35;
                                                uri3 = uri2;
                                                eVar4 = eVar3;
                                                bVar4 = bVar3;
                                                hVar4 = hVar3;
                                                jVar3 = jVar2;
                                                params2 = params;
                                                r15 = obj4;
                                                r16 = obj4;
                                                if (obj == null) {
                                                    r15.b(hVar4.u());
                                                    throw new oq.g();
                                                }
                                                fFloatValue = ((Number) obj).floatValue();
                                                if (fFloatValue == 0.0f) {
                                                    r16.b(hVar4.o());
                                                    throw new oq.g();
                                                }
                                                listA = params2.a();
                                                i45 = i28;
                                                if (!(listA instanceof Collection)) {
                                                    if (!listA.isEmpty()) {
                                                        it = listA.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                z15 = false;
                                                                break;
                                                            }
                                                            iVar = (wx.i) it.next();
                                                            it4 = it;
                                                            if (t.c(iVar.getMetadata().getName() + '.' + iVar.getMetadata().getExtension(), str5)) {
                                                                z15 = true;
                                                                break;
                                                            }
                                                            it = it4;
                                                        }
                                                    } else {
                                                        z15 = false;
                                                        break;
                                                    }
                                                    if (!z15) {
                                                        r16.b(hVar4.p());
                                                        throw new oq.g();
                                                    }
                                                    if (params2.a().size() < params2.getMaxFilesCount()) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    if (z16) {
                                                        r16.b(hVar4.s());
                                                        throw new oq.g();
                                                    }
                                                    str7 = str5;
                                                    iVarA2 = hVar4.checkFileSizeUseCase.a(new bc4.b.Params(fFloatValue, params2.getMaxFileSizeInBytes()));
                                                    if (!(iVarA2 instanceof dx.i.Left)) {
                                                        r16.b(hVar4.r((int) (params2.getMaxFileSizeInBytes() / 1000000.0f)));
                                                        throw new oq.g();
                                                    }
                                                    if (iVarA2 instanceof dx.i.Right) {
                                                        throw new oq.p();
                                                    }
                                                    i0 i0Var = (i0) ((dx.i.Right) iVarA2).b();
                                                    az.f fVar3 = hVar4.fileManager;
                                                    String string2 = uri3.toString();
                                                    this.f83378e = hVar4;
                                                    this.f83379f = jVar3;
                                                    this.f83380g = vq.j.a(bVar4);
                                                    this.f83381h = r16;
                                                    this.f83382j = vq.j.a(eVar4);
                                                    this.f83383k = uri3;
                                                    this.f83384l = str4;
                                                    this.f83385m = str6;
                                                    this.f83386n = vq.j.a(iVarA2);
                                                    this.f83387p = vq.j.a(str7);
                                                    this.f83388q = vq.j.a(i0Var);
                                                    this.f83389r = r16;
                                                    this.f83390s = i37;
                                                    this.f83391t = i38;
                                                    this.f83392v = i29;
                                                    this.f83393w = i36;
                                                    this.f83394x = i45;
                                                    this.f83395y = i39;
                                                    this.B = fFloatValue;
                                                    this.f83396z = 0;
                                                    this.A = 0;
                                                    this.C = 4;
                                                    objM = fVar3.m(string2, this);
                                                    objE = objE;
                                                    if (objM != objE) {
                                                        r17 = r16;
                                                        hVar5 = hVar4;
                                                        str8 = str6;
                                                        objA = ((dx.i) objM).a();
                                                        if (objA != null) {
                                                            return new dx.i.Right(new bc4.i.Result(new wx.i.Regular(new FilePickerMetadata(str4, str8, fFloatValue, uri3.toString()), new FileContent((byte[]) objA))));
                                                        }
                                                        r17.b(hVar5.u());
                                                        throw new oq.g();
                                                    }
                                                } else {
                                                    it = listA.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            z15 = false;
                                                            break;
                                                        }
                                                        iVar = (wx.i) it.next();
                                                        it4 = it;
                                                        if (t.c(iVar.getMetadata().getName() + '.' + iVar.getMetadata().getExtension(), str5)) {
                                                            z15 = true;
                                                            break;
                                                        }
                                                        it = it4;
                                                    }
                                                    if (!z15) {
                                                        r16.b(hVar4.p());
                                                        throw new oq.g();
                                                    }
                                                    if (params2.a().size() < params2.getMaxFilesCount()) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    if (z16) {
                                                        r16.b(hVar4.s());
                                                        throw new oq.g();
                                                    }
                                                    str7 = str5;
                                                    iVarA2 = hVar4.checkFileSizeUseCase.a(new bc4.b.Params(fFloatValue, params2.getMaxFileSizeInBytes()));
                                                    if (!(iVarA2 instanceof dx.i.Left)) {
                                                        r16.b(hVar4.r((int) (params2.getMaxFileSizeInBytes() / 1000000.0f)));
                                                        throw new oq.g();
                                                    }
                                                    if (iVarA2 instanceof dx.i.Right) {
                                                        throw new oq.p();
                                                    }
                                                    i0 i0Var2 = (i0) ((dx.i.Right) iVarA2).b();
                                                    az.f fVar4 = hVar4.fileManager;
                                                    String string3 = uri3.toString();
                                                    this.f83378e = hVar4;
                                                    this.f83379f = jVar3;
                                                    this.f83380g = vq.j.a(bVar4);
                                                    this.f83381h = r16;
                                                    this.f83382j = vq.j.a(eVar4);
                                                    this.f83383k = uri3;
                                                    this.f83384l = str4;
                                                    this.f83385m = str6;
                                                    this.f83386n = vq.j.a(iVarA2);
                                                    this.f83387p = vq.j.a(str7);
                                                    this.f83388q = vq.j.a(i0Var2);
                                                    this.f83389r = r16;
                                                    this.f83390s = i37;
                                                    this.f83391t = i38;
                                                    this.f83392v = i29;
                                                    this.f83393w = i36;
                                                    this.f83394x = i45;
                                                    this.f83395y = i39;
                                                    this.B = fFloatValue;
                                                    this.f83396z = 0;
                                                    this.A = 0;
                                                    this.C = 4;
                                                    objM = fVar4.m(string3, this);
                                                    objE = objE;
                                                    if (objM != objE) {
                                                        r17 = r16;
                                                        hVar5 = hVar4;
                                                        str8 = str6;
                                                        objA = ((dx.i) objM).a();
                                                        if (objA != null) {
                                                            return new dx.i.Right(new bc4.i.Result(new wx.i.Regular(new FilePickerMetadata(str4, str8, fFloatValue, uri3.toString()), new FileContent((byte[]) objA))));
                                                        }
                                                        r17.b(hVar5.u());
                                                        throw new oq.g();
                                                    }
                                                }
                                                return new dx.i.Left((dx.b) ex.d.a(e));
                                            }
                                            return objE;
                                        } catch (ex.c e18) {
                                            e = e18;
                                            obj2 = jVar;
                                        } catch (CancellationException e19) {
                                            e = e19;
                                            obj2 = jVar;
                                            throw e;
                                        } catch (Exception e25) {
                                            e = e25;
                                            obj2 = jVar;
                                            r18 = obj2;
                                            px.f fVar5 = px.f.f163100a;
                                            message = e.getMessage();
                                            if (message == null) {
                                                str2 = str;
                                            } else {
                                                str2 = message;
                                            }
                                            fVar5.d(str2, e, px.c.a(r18));
                                            iVarA = r18.a(e);
                                            if (iVarA instanceof dx.i.Left) {
                                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                            } else {
                                                if (iVarA instanceof dx.i.Right) {
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
                                        str = "";
                                    }
                                } catch (ex.c e29) {
                                    e = e29;
                                } catch (CancellationException e35) {
                                    e = e35;
                                } catch (Exception e36) {
                                    e = e36;
                                }
                            } else if (i46 == 3) {
                                i39 = this.f83395y;
                                int i68 = this.f83394x;
                                int i69 = this.f83393w;
                                int i75 = this.f83392v;
                                int i76 = this.f83391t;
                                int i77 = this.f83390s;
                                str5 = (String) this.f83388q;
                                ex.b bVar11 = (ex.b) this.f83387p;
                                str6 = (String) this.f83386n;
                                String str9 = (String) this.f83385m;
                                Uri uri5 = (Uri) this.f83384l;
                                zz.e eVar5 = (zz.e) this.f83383k;
                                ex.b bVar12 = (ex.b) this.f83382j;
                                bVar4 = (ex.b) this.f83381h;
                                dx.j<dx.b> jVar5 = (dx.j) this.f83380g;
                                bc4.i.Params params6 = (bc4.i.Params) this.f83379f;
                                h hVar8 = (h) this.f83378e;
                                try {
                                    u.b(obj);
                                    hVar4 = hVar8;
                                    i37 = i77;
                                    uri3 = uri5;
                                    str4 = str9;
                                    r15 = bVar11;
                                    i38 = i76;
                                    i29 = i75;
                                    r16 = bVar12;
                                    i36 = i69;
                                    eVar4 = eVar5;
                                    i28 = i68;
                                    str = "";
                                    jVar3 = jVar5;
                                    params2 = params6;
                                    try {
                                        if (obj == null) {
                                            r15.b(hVar4.u());
                                            throw new oq.g();
                                        }
                                        try {
                                            fFloatValue = ((Number) obj).floatValue();
                                            if (fFloatValue == 0.0f) {
                                                r16.b(hVar4.o());
                                                throw new oq.g();
                                            }
                                            listA = params2.a();
                                            i45 = i28;
                                            if (!(listA instanceof Collection)) {
                                                it = listA.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        z15 = false;
                                                        break;
                                                    }
                                                    iVar = (wx.i) it.next();
                                                    it4 = it;
                                                    if (t.c(iVar.getMetadata().getName() + '.' + iVar.getMetadata().getExtension(), str5)) {
                                                        z15 = true;
                                                        break;
                                                    }
                                                    it = it4;
                                                }
                                                if (!z15) {
                                                    r16.b(hVar4.p());
                                                    throw new oq.g();
                                                }
                                                if (params2.a().size() < params2.getMaxFilesCount()) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                                if (z16) {
                                                    r16.b(hVar4.s());
                                                    throw new oq.g();
                                                }
                                                str7 = str5;
                                                iVarA2 = hVar4.checkFileSizeUseCase.a(new bc4.b.Params(fFloatValue, params2.getMaxFileSizeInBytes()));
                                                if (!(iVarA2 instanceof dx.i.Left)) {
                                                    r16.b(hVar4.r((int) (params2.getMaxFileSizeInBytes() / 1000000.0f)));
                                                    throw new oq.g();
                                                }
                                                if (iVarA2 instanceof dx.i.Right) {
                                                    throw new oq.p();
                                                }
                                                i0 i0Var3 = (i0) ((dx.i.Right) iVarA2).b();
                                                az.f fVar6 = hVar4.fileManager;
                                                String string4 = uri3.toString();
                                                this.f83378e = hVar4;
                                                this.f83379f = jVar3;
                                                this.f83380g = vq.j.a(bVar4);
                                                this.f83381h = r16;
                                                this.f83382j = vq.j.a(eVar4);
                                                this.f83383k = uri3;
                                                this.f83384l = str4;
                                                this.f83385m = str6;
                                                this.f83386n = vq.j.a(iVarA2);
                                                this.f83387p = vq.j.a(str7);
                                                this.f83388q = vq.j.a(i0Var3);
                                                this.f83389r = r16;
                                                this.f83390s = i37;
                                                this.f83391t = i38;
                                                this.f83392v = i29;
                                                this.f83393w = i36;
                                                this.f83394x = i45;
                                                this.f83395y = i39;
                                                this.B = fFloatValue;
                                                this.f83396z = 0;
                                                this.A = 0;
                                                this.C = 4;
                                                objM = fVar6.m(string4, this);
                                                objE = objE;
                                                if (objM != objE) {
                                                    r17 = r16;
                                                    hVar5 = hVar4;
                                                    str8 = str6;
                                                    objA = ((dx.i) objM).a();
                                                    if (objA != null) {
                                                        return new dx.i.Right(new bc4.i.Result(new wx.i.Regular(new FilePickerMetadata(str4, str8, fFloatValue, uri3.toString()), new FileContent((byte[]) objA))));
                                                    }
                                                    r17.b(hVar5.u());
                                                    throw new oq.g();
                                                }
                                                return objE;
                                            }
                                            try {
                                                if (!listA.isEmpty()) {
                                                    it = listA.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            z15 = false;
                                                            break;
                                                        }
                                                        iVar = (wx.i) it.next();
                                                        it4 = it;
                                                        if (t.c(iVar.getMetadata().getName() + '.' + iVar.getMetadata().getExtension(), str5)) {
                                                            z15 = true;
                                                            break;
                                                        }
                                                        it = it4;
                                                    }
                                                } else {
                                                    z15 = false;
                                                    break;
                                                }
                                                if (!z15) {
                                                    r16.b(hVar4.p());
                                                    throw new oq.g();
                                                }
                                                if (params2.a().size() < params2.getMaxFilesCount()) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                                if (z16) {
                                                    r16.b(hVar4.s());
                                                    throw new oq.g();
                                                }
                                                str7 = str5;
                                                iVarA2 = hVar4.checkFileSizeUseCase.a(new bc4.b.Params(fFloatValue, params2.getMaxFileSizeInBytes()));
                                                if (!(iVarA2 instanceof dx.i.Left)) {
                                                    r16.b(hVar4.r((int) (params2.getMaxFileSizeInBytes() / 1000000.0f)));
                                                    throw new oq.g();
                                                }
                                                if (iVarA2 instanceof dx.i.Right) {
                                                    throw new oq.p();
                                                }
                                                i0 i0Var4 = (i0) ((dx.i.Right) iVarA2).b();
                                                az.f fVar7 = hVar4.fileManager;
                                                String string5 = uri3.toString();
                                                this.f83378e = hVar4;
                                                this.f83379f = jVar3;
                                                this.f83380g = vq.j.a(bVar4);
                                                this.f83381h = r16;
                                                this.f83382j = vq.j.a(eVar4);
                                                this.f83383k = uri3;
                                                this.f83384l = str4;
                                                this.f83385m = str6;
                                                this.f83386n = vq.j.a(iVarA2);
                                                this.f83387p = vq.j.a(str7);
                                                this.f83388q = vq.j.a(i0Var4);
                                                this.f83389r = r16;
                                                this.f83390s = i37;
                                                this.f83391t = i38;
                                                this.f83392v = i29;
                                                this.f83393w = i36;
                                                this.f83394x = i45;
                                                this.f83395y = i39;
                                                this.B = fFloatValue;
                                                this.f83396z = 0;
                                                this.A = 0;
                                                this.C = 4;
                                                objM = fVar7.m(string5, this);
                                                objE = objE;
                                                if (objM != objE) {
                                                    r17 = r16;
                                                    hVar5 = hVar4;
                                                    str8 = str6;
                                                    objA = ((dx.i) objM).a();
                                                    if (objA != null) {
                                                        return new dx.i.Right(new bc4.i.Result(new wx.i.Regular(new FilePickerMetadata(str4, str8, fFloatValue, uri3.toString()), new FileContent((byte[]) objA))));
                                                    }
                                                    r17.b(hVar5.u());
                                                    throw new oq.g();
                                                }
                                                return objE;
                                            } catch (ex.c e37) {
                                                e = e37;
                                            } catch (CancellationException e38) {
                                                throw e38;
                                            } catch (Exception e39) {
                                                e = e39;
                                                r18 = jVar3;
                                                px.f fVar8 = px.f.f163100a;
                                                message = e.getMessage();
                                                if (message == null) {
                                                    str2 = str;
                                                } else {
                                                    str2 = message;
                                                }
                                                fVar8.d(str2, e, px.c.a(r18));
                                                iVarA = r18.a(e);
                                                if (iVarA instanceof dx.i.Left) {
                                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                } else {
                                                    if (iVarA instanceof dx.i.Right) {
                                                        throw new oq.p();
                                                    }
                                                    objB = ((dx.i.Right) iVarA).b();
                                                }
                                                return new dx.i.Left(objB);
                                            }
                                        } catch (ex.c e45) {
                                            e = e45;
                                            obj3 = jVar3;
                                        } catch (CancellationException e46) {
                                            e = e46;
                                            obj3 = jVar3;
                                            throw e;
                                        } catch (Exception e47) {
                                            e = e47;
                                            obj3 = jVar3;
                                            r18 = obj3;
                                            px.f fVar9 = px.f.f163100a;
                                            message = e.getMessage();
                                            if (message == null) {
                                                str2 = str;
                                            } else {
                                                str2 = message;
                                            }
                                            fVar9.d(str2, e, px.c.a(r18));
                                            iVarA = r18.a(e);
                                            if (iVarA instanceof dx.i.Left) {
                                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                            } else {
                                                if (iVarA instanceof dx.i.Right) {
                                                    throw new oq.p();
                                                }
                                                objB = ((dx.i.Right) iVarA).b();
                                            }
                                            return new dx.i.Left(objB);
                                        }
                                        return new dx.i.Left((dx.b) ex.d.a(e));
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
                                    throw e57;
                                } catch (Exception e58) {
                                    e = e58;
                                    str = "";
                                    r18 = jVar5;
                                    px.f fVar10 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        str2 = str;
                                    } else {
                                        str2 = message;
                                    }
                                    fVar10.d(str2, e, px.c.a(r18));
                                    iVarA = r18.a(e);
                                    if (iVarA instanceof dx.i.Left) {
                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                    } else {
                                        if (iVarA instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                            } else {
                                if (i46 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                float f15 = this.B;
                                ex.b bVar13 = (ex.b) this.f83389r;
                                str8 = (String) this.f83385m;
                                str4 = (String) this.f83384l;
                                uri3 = (Uri) this.f83383k;
                                hVar5 = (h) this.f83378e;
                                u.b(obj);
                                fFloatValue = f15;
                                objM = obj;
                                r17 = bVar13;
                                try {
                                    objA = ((dx.i) objM).a();
                                    if (objA != null) {
                                        return new dx.i.Right(new bc4.i.Result(new wx.i.Regular(new FilePickerMetadata(str4, str8, fFloatValue, uri3.toString()), new FileContent((byte[]) objA))));
                                    }
                                    r17.b(hVar5.u());
                                    throw new oq.g();
                                } catch (ex.c e59) {
                                    e = e59;
                                } catch (CancellationException e65) {
                                    throw e65;
                                }
                            }
                            if (t.c(eVar, zz.e.a.f238544a)) {
                                bVar2.b(hVar.n());
                                throw new oq.g();
                            }
                            if (!(eVar instanceof zz.e.UriResult)) {
                                throw new oq.p();
                            }
                            Uri uri6 = ((zz.e.UriResult) eVar).getUri();
                            if (uri6 == null) {
                                bVar2.b(hVar.t());
                                throw new oq.g();
                            }
                            az.f fVar11 = hVar.fileManager;
                            bVar3 = bVar;
                            String string6 = uri6.toString();
                            this.f83378e = hVar;
                            this.f83379f = params;
                            this.f83380g = jVar;
                            h hVar9 = hVar;
                            this.f83381h = vq.j.a(bVar3);
                            this.f83382j = bVar2;
                            this.f83383k = vq.j.a(eVar);
                            this.f83384l = uri6;
                            this.f83385m = bVar2;
                            this.f83390s = i19;
                            this.f83391t = i18;
                            this.f83392v = i17;
                            this.f83393w = i16;
                            this.f83394x = i15;
                            this.f83395y = 0;
                            i25 = 2;
                            this.C = 2;
                            objF = fVar11.f(string6, this);
                            if (objF != objE) {
                                i26 = i19;
                                ex.b bVar14 = bVar2;
                                obj2 = bVar14;
                                eVar2 = eVar;
                                uri = uri6;
                                i27 = i18;
                                i28 = i15;
                                i29 = i17;
                                i35 = 0;
                                i36 = i16;
                                hVar2 = hVar9;
                                obj3 = bVar14;
                                if (objF != null) {
                                    obj3.b(hVar2.u());
                                    throw new oq.g();
                                }
                                str3 = (String) objF;
                                eVar3 = eVar2;
                                strS1 = r.s1(str3, ".", null, i25, null);
                                strI1 = r.i1(str3, ".", "");
                                az.f fVar12 = hVar2.fileManager;
                                str = "";
                                String string7 = uri.toString();
                                this.f83378e = hVar2;
                                this.f83379f = params;
                                this.f83380g = jVar;
                                hVar3 = hVar2;
                                this.f83381h = vq.j.a(bVar3);
                                obj4 = obj2;
                                this.f83382j = obj4;
                                jVar2 = jVar;
                                this.f83383k = vq.j.a(eVar3);
                                uri2 = uri;
                                this.f83384l = uri2;
                                this.f83385m = strS1;
                                this.f83386n = strI1;
                                this.f83387p = obj4;
                                this.f83388q = str3;
                                this.f83390s = i26;
                                this.f83391t = i27;
                                this.f83392v = i29;
                                this.f83393w = i36;
                                this.f83394x = i28;
                                this.f83395y = i35;
                                this.C = 3;
                                objK = fVar12.k(string7, this);
                                if (objK != objE) {
                                    str4 = strS1;
                                    obj = objK;
                                    i37 = i26;
                                    i38 = i27;
                                    str5 = str3;
                                    str6 = strI1;
                                    i39 = i35;
                                    uri3 = uri2;
                                    eVar4 = eVar3;
                                    bVar4 = bVar3;
                                    hVar4 = hVar3;
                                    jVar3 = jVar2;
                                    params2 = params;
                                    r15 = obj4;
                                    r16 = obj4;
                                    if (obj == null) {
                                        r15.b(hVar4.u());
                                        throw new oq.g();
                                    }
                                    fFloatValue = ((Number) obj).floatValue();
                                    if (fFloatValue == 0.0f) {
                                        r16.b(hVar4.o());
                                        throw new oq.g();
                                    }
                                    listA = params2.a();
                                    i45 = i28;
                                    if (!(listA instanceof Collection)) {
                                        if (!listA.isEmpty()) {
                                            it = listA.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    z15 = false;
                                                    break;
                                                }
                                                iVar = (wx.i) it.next();
                                                it4 = it;
                                                if (t.c(iVar.getMetadata().getName() + '.' + iVar.getMetadata().getExtension(), str5)) {
                                                    z15 = true;
                                                    break;
                                                }
                                                it = it4;
                                            }
                                        } else {
                                            z15 = false;
                                            break;
                                        }
                                        if (!z15) {
                                            r16.b(hVar4.p());
                                            throw new oq.g();
                                        }
                                        if (params2.a().size() < params2.getMaxFilesCount()) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (z16) {
                                            r16.b(hVar4.s());
                                            throw new oq.g();
                                        }
                                        str7 = str5;
                                        iVarA2 = hVar4.checkFileSizeUseCase.a(new bc4.b.Params(fFloatValue, params2.getMaxFileSizeInBytes()));
                                        if (!(iVarA2 instanceof dx.i.Left)) {
                                            r16.b(hVar4.r((int) (params2.getMaxFileSizeInBytes() / 1000000.0f)));
                                            throw new oq.g();
                                        }
                                        if (iVarA2 instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        i0 i0Var5 = (i0) ((dx.i.Right) iVarA2).b();
                                        az.f fVar13 = hVar4.fileManager;
                                        String string8 = uri3.toString();
                                        this.f83378e = hVar4;
                                        this.f83379f = jVar3;
                                        this.f83380g = vq.j.a(bVar4);
                                        this.f83381h = r16;
                                        this.f83382j = vq.j.a(eVar4);
                                        this.f83383k = uri3;
                                        this.f83384l = str4;
                                        this.f83385m = str6;
                                        this.f83386n = vq.j.a(iVarA2);
                                        this.f83387p = vq.j.a(str7);
                                        this.f83388q = vq.j.a(i0Var5);
                                        this.f83389r = r16;
                                        this.f83390s = i37;
                                        this.f83391t = i38;
                                        this.f83392v = i29;
                                        this.f83393w = i36;
                                        this.f83394x = i45;
                                        this.f83395y = i39;
                                        this.B = fFloatValue;
                                        this.f83396z = 0;
                                        this.A = 0;
                                        this.C = 4;
                                        objM = fVar13.m(string8, this);
                                        objE = objE;
                                        if (objM != objE) {
                                            r17 = r16;
                                            hVar5 = hVar4;
                                            str8 = str6;
                                            objA = ((dx.i) objM).a();
                                            if (objA != null) {
                                                return new dx.i.Right(new bc4.i.Result(new wx.i.Regular(new FilePickerMetadata(str4, str8, fFloatValue, uri3.toString()), new FileContent((byte[]) objA))));
                                            }
                                            r17.b(hVar5.u());
                                            throw new oq.g();
                                        }
                                    } else {
                                        it = listA.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                z15 = false;
                                                break;
                                            }
                                            iVar = (wx.i) it.next();
                                            it4 = it;
                                            if (t.c(iVar.getMetadata().getName() + '.' + iVar.getMetadata().getExtension(), str5)) {
                                                z15 = true;
                                                break;
                                            }
                                            it = it4;
                                        }
                                        if (!z15) {
                                            r16.b(hVar4.p());
                                            throw new oq.g();
                                        }
                                        if (params2.a().size() < params2.getMaxFilesCount()) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (z16) {
                                            r16.b(hVar4.s());
                                            throw new oq.g();
                                        }
                                        str7 = str5;
                                        iVarA2 = hVar4.checkFileSizeUseCase.a(new bc4.b.Params(fFloatValue, params2.getMaxFileSizeInBytes()));
                                        if (!(iVarA2 instanceof dx.i.Left)) {
                                            r16.b(hVar4.r((int) (params2.getMaxFileSizeInBytes() / 1000000.0f)));
                                            throw new oq.g();
                                        }
                                        if (iVarA2 instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        i0 i0Var6 = (i0) ((dx.i.Right) iVarA2).b();
                                        az.f fVar14 = hVar4.fileManager;
                                        String string9 = uri3.toString();
                                        this.f83378e = hVar4;
                                        this.f83379f = jVar3;
                                        this.f83380g = vq.j.a(bVar4);
                                        this.f83381h = r16;
                                        this.f83382j = vq.j.a(eVar4);
                                        this.f83383k = uri3;
                                        this.f83384l = str4;
                                        this.f83385m = str6;
                                        this.f83386n = vq.j.a(iVarA2);
                                        this.f83387p = vq.j.a(str7);
                                        this.f83388q = vq.j.a(i0Var6);
                                        this.f83389r = r16;
                                        this.f83390s = i37;
                                        this.f83391t = i38;
                                        this.f83392v = i29;
                                        this.f83393w = i36;
                                        this.f83394x = i45;
                                        this.f83395y = i39;
                                        this.B = fFloatValue;
                                        this.f83396z = 0;
                                        this.A = 0;
                                        this.C = 4;
                                        objM = fVar14.m(string9, this);
                                        objE = objE;
                                        if (objM != objE) {
                                            r17 = r16;
                                            hVar5 = hVar4;
                                            str8 = str6;
                                            objA = ((dx.i) objM).a();
                                            if (objA != null) {
                                                return new dx.i.Right(new bc4.i.Result(new wx.i.Regular(new FilePickerMetadata(str4, str8, fFloatValue, uri3.toString()), new FileContent((byte[]) objA))));
                                            }
                                            r17.b(hVar5.u());
                                            throw new oq.g();
                                        }
                                    }
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                }
                            }
                            return objE;
                        } catch (ex.c e66) {
                            e = e66;
                        } catch (CancellationException e67) {
                            e = e67;
                            throw e;
                        } catch (Exception e68) {
                            e = e68;
                            r18 = jVar;
                            px.f fVar15 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                str2 = str;
                            } else {
                                str2 = message;
                            }
                            fVar15.d(str2, e, px.c.a(r18));
                            iVarA = r18.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                        eVar = (zz.e) objI;
                    } catch (CancellationException e69) {
                        throw e69;
                    }
                } catch (Exception e75) {
                    e = e75;
                }
            } catch (ex.c e76) {
                e = e76;
            } catch (CancellationException e77) {
                throw e77;
            } catch (Exception e78) {
                e = e78;
                str = "";
            }
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return h.this.new a(this.E, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, bc4.i.Result>> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    public h(zz.b bVar, az.f fVar, mx.c cVar, bc4.b bVar2, ac4.a aVar) {
        this.filePickerManager = bVar;
        this.fileManager = fVar;
        this.labelProvider = cVar;
        this.checkFileSizeUseCase = bVar2;
        this.callActionWithLoaderUseCase = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business n() {
        return new dx.b.Business(zb4.b.ACTIVITY_NOT_FOUND, null, this.labelProvider.c(xb4.a.f217905c), this.labelProvider.c(xb4.a.f217922t), null, this.labelProvider.c(xb4.a.f217904b), null, 82, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business o() {
        return new dx.b.Business(zb4.b.EMPTY_FILE, null, this.labelProvider.c(xb4.a.f217908f), this.labelProvider.c(xb4.a.f217903a), null, this.labelProvider.c(xb4.a.f217904b), null, 82, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business p() {
        return new dx.b.Business(zb4.b.FILE_ALREADY_PICKED, null, this.labelProvider.c(xb4.a.f217907e), this.labelProvider.c(xb4.a.f217906d), null, this.labelProvider.c(xb4.a.f217904b), null, 82, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business r(int maxFileSizeInMB) {
        return new dx.b.Business(zb4.b.MAX_FILE_SIZE_EXCEEDED, null, this.labelProvider.c(xb4.a.f217914l), this.labelProvider.e(xb4.a.f217912j, String.valueOf(maxFileSizeInMB)), null, this.labelProvider.c(xb4.a.f217904b), null, 82, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business s() {
        return new dx.b.Business(zb4.b.ALLOWED_FILES_NUMBER_EXCEEDED, null, this.labelProvider.c(xb4.a.f217915m), Label.INSTANCE.c(), null, this.labelProvider.c(xb4.a.f217904b), null, 82, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business t() {
        return new dx.b.Business(zb4.b.NO_FILE_PICKED, null, Label.INSTANCE.c(), null, null, this.labelProvider.c(xb4.a.f217904b), null, 90, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business u() {
        return new dx.b.Business(zb4.b.FILE_DATA_ERROR, null, this.labelProvider.c(xb4.a.f217926x), null, null, this.labelProvider.c(xb4.a.f217904b), null, 90, null);
    }

    @Override // gz.b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Object c(bc4.i.Params params, tq.e<? super dx.i<? extends dx.b, bc4.i.Result>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(params, null), eVar, 1, null);
    }
}
