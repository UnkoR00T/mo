package hc4;

import android.net.Uri;
import fr.t;
import fu.r;
import java.util.Arrays;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0096B¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lhc4/g;", "Lbc4/h;", "Lzz/b;", "pickFileManager", "Laz/f;", "fileDataManager", "Lbc4/b;", "checkFileSizeUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lmx/c;", "labelProvider", "<init>", "(Lzz/b;Laz/f;Lbc4/b;Lac4/a;Lmx/c;)V", "Ldx/b$c;", "o", "()Ldx/b$c;", "l", "n", "k", "Lbc4/h$a;", "params", "Ldx/i;", "Ldx/b;", "Lbc4/h$b;", "m", "(Lbc4/h$a;Ltq/e;)Ljava/lang/Object;", "a", "Lzz/b;", "b", "Laz/f;", "c", "Lbc4/b;", "d", "Lac4/a;", "e", "Lmx/c;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements bc4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zz.b pickFileManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final az.f fileDataManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bc4.b checkFileSizeUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lbc4/h$b;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends bc4.h.Result>>, Object> {
        int A;
        int B;
        int C;
        float D;
        int E;
        final /* synthetic */ bc4.h.Params G;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f83354e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f83355f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f83356g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f83357h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f83358j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f83359k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f83360l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f83361m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f83362n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f83363p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f83364q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f83365r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f83366s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f83367t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f83368v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f83369w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f83370x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f83371y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f83372z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(bc4.h.Params params, tq.e<? super a> eVar) {
            super(1, eVar);
            this.G = params;
        }

        /* JADX WARN: Code duplicated, block: B:102:0x0389 A[Catch: Exception -> 0x0355, c -> 0x0358, CancellationException -> 0x035b, TryCatch #19 {Exception -> 0x0355, blocks: (B:80:0x0336, B:82:0x033e, B:84:0x034a, B:102:0x0389, B:103:0x03aa, B:105:0x03b2, B:158:0x0451, B:159:0x045d, B:106:0x03b9, B:107:0x03c5, B:93:0x035e, B:94:0x0362, B:96:0x0368, B:98:0x037c, B:108:0x03c6, B:109:0x03d2, B:171:0x047d, B:174:0x048b), top: B:190:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:105:0x03b2 A[Catch: Exception -> 0x0355, c -> 0x0358, CancellationException -> 0x035b, TryCatch #19 {Exception -> 0x0355, blocks: (B:80:0x0336, B:82:0x033e, B:84:0x034a, B:102:0x0389, B:103:0x03aa, B:105:0x03b2, B:158:0x0451, B:159:0x045d, B:106:0x03b9, B:107:0x03c5, B:93:0x035e, B:94:0x0362, B:96:0x0368, B:98:0x037c, B:108:0x03c6, B:109:0x03d2, B:171:0x047d, B:174:0x048b), top: B:190:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:106:0x03b9 A[Catch: Exception -> 0x0355, c -> 0x0358, CancellationException -> 0x035b, TryCatch #19 {Exception -> 0x0355, blocks: (B:80:0x0336, B:82:0x033e, B:84:0x034a, B:102:0x0389, B:103:0x03aa, B:105:0x03b2, B:158:0x0451, B:159:0x045d, B:106:0x03b9, B:107:0x03c5, B:93:0x035e, B:94:0x0362, B:96:0x0368, B:98:0x037c, B:108:0x03c6, B:109:0x03d2, B:171:0x047d, B:174:0x048b), top: B:190:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:108:0x03c6 A[Catch: Exception -> 0x0355, c -> 0x0358, CancellationException -> 0x035b, TryCatch #19 {Exception -> 0x0355, blocks: (B:80:0x0336, B:82:0x033e, B:84:0x034a, B:102:0x0389, B:103:0x03aa, B:105:0x03b2, B:158:0x0451, B:159:0x045d, B:106:0x03b9, B:107:0x03c5, B:93:0x035e, B:94:0x0362, B:96:0x0368, B:98:0x037c, B:108:0x03c6, B:109:0x03d2, B:171:0x047d, B:174:0x048b), top: B:190:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:122:0x03ee  */
        /* JADX WARN: Code duplicated, block: B:125:0x03f6 A[Catch: Exception -> 0x03d3, c -> 0x03d8, CancellationException -> 0x03dd, TryCatch #19 {c -> 0x03d8, CancellationException -> 0x03dd, Exception -> 0x03d3, blocks: (B:75:0x02e9, B:123:0x03f0, B:124:0x03f5, B:125:0x03f6, B:126:0x0404), top: B:197:0x0295 }] */
        /* JADX WARN: Code duplicated, block: B:145:0x042c  */
        /* JADX WARN: Code duplicated, block: B:177:0x0494  */
        /* JADX WARN: Code duplicated, block: B:178:0x0497  */
        /* JADX WARN: Code duplicated, block: B:181:0x04a7  */
        /* JADX WARN: Code duplicated, block: B:182:0x04b5  */
        /* JADX WARN: Code duplicated, block: B:184:0x04b9  */
        /* JADX WARN: Code duplicated, block: B:187:0x04c6  */
        /* JADX WARN: Code duplicated, block: B:193:0x0297 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:200:0x022f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:207:0x037c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:208:0x0353 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:211:0x0362 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:65:0x0287  */
        /* JADX WARN: Code duplicated, block: B:69:0x02bc  */
        /* JADX WARN: Code duplicated, block: B:71:0x02c2 A[Catch: Exception -> 0x03e2, c -> 0x03e6, CancellationException -> 0x03ea, TryCatch #22 {c -> 0x03e6, CancellationException -> 0x03ea, Exception -> 0x03e2, blocks: (B:67:0x0297, B:71:0x02c2, B:73:0x02c6), top: B:193:0x0297 }] */
        /* JADX WARN: Code duplicated, block: B:73:0x02c6 A[Catch: Exception -> 0x03e2, c -> 0x03e6, CancellationException -> 0x03ea, TRY_LEAVE, TryCatch #22 {c -> 0x03e6, CancellationException -> 0x03ea, Exception -> 0x03e2, blocks: (B:67:0x0297, B:71:0x02c2, B:73:0x02c6), top: B:193:0x0297 }] */
        /* JADX WARN: Code duplicated, block: B:79:0x0330  */
        /* JADX WARN: Code duplicated, block: B:82:0x033e A[Catch: Exception -> 0x0355, c -> 0x0358, CancellationException -> 0x035b, TryCatch #19 {Exception -> 0x0355, blocks: (B:80:0x0336, B:82:0x033e, B:84:0x034a, B:102:0x0389, B:103:0x03aa, B:105:0x03b2, B:158:0x0451, B:159:0x045d, B:106:0x03b9, B:107:0x03c5, B:93:0x035e, B:94:0x0362, B:96:0x0368, B:98:0x037c, B:108:0x03c6, B:109:0x03d2, B:171:0x047d, B:174:0x048b), top: B:190:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x034a A[Catch: Exception -> 0x0355, c -> 0x0358, CancellationException -> 0x035b, TryCatch #19 {Exception -> 0x0355, blocks: (B:80:0x0336, B:82:0x033e, B:84:0x034a, B:102:0x0389, B:103:0x03aa, B:105:0x03b2, B:158:0x0451, B:159:0x045d, B:106:0x03b9, B:107:0x03c5, B:93:0x035e, B:94:0x0362, B:96:0x0368, B:98:0x037c, B:108:0x03c6, B:109:0x03d2, B:171:0x047d, B:174:0x048b), top: B:190:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:93:0x035e A[Catch: Exception -> 0x0355, c -> 0x0358, CancellationException -> 0x035b, TryCatch #19 {Exception -> 0x0355, blocks: (B:80:0x0336, B:82:0x033e, B:84:0x034a, B:102:0x0389, B:103:0x03aa, B:105:0x03b2, B:158:0x0451, B:159:0x045d, B:106:0x03b9, B:107:0x03c5, B:93:0x035e, B:94:0x0362, B:96:0x0368, B:98:0x037c, B:108:0x03c6, B:109:0x03d2, B:171:0x047d, B:174:0x048b), top: B:190:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:96:0x0368 A[Catch: Exception -> 0x0355, c -> 0x0358, CancellationException -> 0x035b, TryCatch #19 {Exception -> 0x0355, blocks: (B:80:0x0336, B:82:0x033e, B:84:0x034a, B:102:0x0389, B:103:0x03aa, B:105:0x03b2, B:158:0x0451, B:159:0x045d, B:106:0x03b9, B:107:0x03c5, B:93:0x035e, B:94:0x0362, B:96:0x0368, B:98:0x037c, B:108:0x03c6, B:109:0x03d2, B:171:0x047d, B:174:0x048b), top: B:190:0x0010 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r12v10 */
        /* JADX WARN: Type inference failed for: r12v14 */
        /* JADX WARN: Type inference failed for: r12v15 */
        /* JADX WARN: Type inference failed for: r12v16 */
        /* JADX WARN: Type inference failed for: r12v24 */
        /* JADX WARN: Type inference failed for: r12v30 */
        /* JADX WARN: Type inference failed for: r12v4 */
        /* JADX WARN: Type inference failed for: r13v19 */
        /* JADX WARN: Type inference failed for: r13v6 */
        /* JADX WARN: Type inference failed for: r13v7, types: [bc4.h$a] */
        /* JADX WARN: Type inference failed for: r16v0 */
        /* JADX WARN: Type inference failed for: r16v1, types: [bc4.h$a] */
        /* JADX WARN: Type inference failed for: r16v12 */
        /* JADX WARN: Type inference failed for: r16v2 */
        /* JADX WARN: Type inference failed for: r16v3 */
        /* JADX WARN: Type inference failed for: r16v4 */
        /* JADX WARN: Type inference failed for: r16v5 */
        /* JADX WARN: Type inference failed for: r16v6 */
        /* JADX WARN: Type inference failed for: r16v7 */
        /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String str;
            ?? r15;
            String message;
            String str2;
            dx.i iVarA;
            Object objB;
            g gVar;
            bc4.h.Params params;
            Object objI;
            ex.b bVar;
            ex.b bVar2;
            dx.j<dx.b> jVar;
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
            ex.b bVar4;
            dx.j<dx.b> jVar2;
            zz.e eVar2;
            Uri uri;
            int i27;
            ex.b bVar5;
            bc4.h.Params params2;
            int i28;
            int i29;
            int i35;
            int i36;
            g gVar2;
            String str3;
            String strS1;
            String strI1;
            g gVar3;
            dx.j<dx.b> jVar3;
            ex.b bVar6;
            bc4.h.Params params3;
            Uri uri2;
            Object objK;
            String str4;
            int i37;
            Uri uri3;
            zz.e eVar3;
            String str5;
            ex.b bVar7;
            dx.j<dx.b> jVar4;
            ?? r16;
            float fFloatValue;
            zz.e eVar4;
            int i38;
            dx.i<? extends dx.b, ? extends i0> iVarA2;
            ?? r17;
            boolean z15;
            Object objM;
            Uri uri4;
            ex.b bVar8;
            ex.b bVar9;
            ?? r18;
            bc4.h.Result result;
            Object objA;
            byte[] bArr;
            List<wx.i.Regular> listB;
            Iterator it;
            wx.i.Regular regular;
            boolean z16;
            Object objE = uq.b.e();
            int i39 = this.E;
            try {
                try {
                    try {
                        try {
                            try {
                                if (i39 == 0) {
                                    u.b(obj);
                                    gVar = g.this;
                                    params = this.G;
                                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                                    ex.a aVar = new ex.a();
                                    zz.b bVar10 = gVar.pickFileManager;
                                    List<wx.f> listC = params.c();
                                    this.f83354e = gVar;
                                    this.f83355f = params;
                                    this.f83356g = jVarA;
                                    this.f83357h = vq.j.a(aVar);
                                    this.f83358j = aVar;
                                    this.f83368v = 0;
                                    this.f83369w = 0;
                                    this.f83370x = 0;
                                    this.f83371y = 0;
                                    this.f83372z = 0;
                                    this.E = 1;
                                    objI = bVar10.i(listC, this);
                                    if (objI != objE) {
                                        bVar = aVar;
                                        bVar2 = bVar;
                                        jVar = jVarA;
                                        i15 = 0;
                                        i16 = 0;
                                        i17 = 0;
                                        i18 = 0;
                                        i19 = 0;
                                    }
                                    return objE;
                                }
                                if (i39 == 1) {
                                    int i45 = this.f83372z;
                                    int i46 = this.f83371y;
                                    int i47 = this.f83370x;
                                    int i48 = this.f83369w;
                                    int i49 = this.f83368v;
                                    ex.b bVar11 = (ex.b) this.f83358j;
                                    ex.b bVar12 = (ex.b) this.f83357h;
                                    dx.j<dx.b> jVar5 = (dx.j) this.f83356g;
                                    bc4.h.Params params4 = (bc4.h.Params) this.f83355f;
                                    g gVar4 = (g) this.f83354e;
                                    u.b(obj);
                                    bVar2 = bVar11;
                                    jVar = jVar5;
                                    i16 = i46;
                                    i19 = i49;
                                    params = params4;
                                    i18 = i48;
                                    i15 = i45;
                                    gVar = gVar4;
                                    bVar = bVar12;
                                    i17 = i47;
                                    objI = obj;
                                } else if (i39 == 2) {
                                    int i55 = this.A;
                                    int i56 = this.f83372z;
                                    int i57 = this.f83371y;
                                    int i58 = this.f83370x;
                                    int i59 = this.f83369w;
                                    int i65 = this.f83368v;
                                    ex.b bVar13 = (ex.b) this.f83361m;
                                    Uri uri5 = (Uri) this.f83360l;
                                    eVar2 = (zz.e) this.f83359k;
                                    ex.b bVar14 = (ex.b) this.f83358j;
                                    ex.b bVar15 = (ex.b) this.f83357h;
                                    dx.j<dx.b> jVar6 = (dx.j) this.f83356g;
                                    bc4.h.Params params5 = (bc4.h.Params) this.f83355f;
                                    g gVar5 = (g) this.f83354e;
                                    try {
                                        u.b(obj);
                                        objF = obj;
                                        uri = uri5;
                                        i26 = i65;
                                        i28 = i58;
                                        i36 = i56;
                                        i29 = i55;
                                        bVar3 = bVar15;
                                        jVar2 = jVar6;
                                        bVar4 = bVar14;
                                        gVar2 = gVar5;
                                        bVar5 = bVar13;
                                        i25 = 2;
                                        i27 = i59;
                                        i35 = i57;
                                        params2 = params5;
                                        try {
                                            if (objF != null) {
                                                bVar5.b(gVar2.o());
                                                throw new oq.g();
                                            }
                                            try {
                                                str3 = (String) objF;
                                                strS1 = r.s1(str3, ".", null, i25, null);
                                                strI1 = r.i1(str3, ".", "");
                                                az.f fVar = gVar2.fileDataManager;
                                                str = "";
                                                String string = uri.toString();
                                                this.f83354e = gVar2;
                                                this.f83355f = params2;
                                                gVar3 = gVar2;
                                                jVar3 = jVar2;
                                                try {
                                                    this.f83356g = jVar3;
                                                    this.f83357h = vq.j.a(bVar3);
                                                    bVar6 = bVar4;
                                                    this.f83358j = bVar6;
                                                    params3 = params2;
                                                    this.f83359k = vq.j.a(eVar2);
                                                    uri2 = uri;
                                                    this.f83360l = uri2;
                                                    this.f83361m = strS1;
                                                    this.f83362n = strI1;
                                                    this.f83363p = bVar6;
                                                    this.f83364q = str3;
                                                    this.f83368v = i26;
                                                    this.f83369w = i27;
                                                    this.f83370x = i28;
                                                    this.f83371y = i35;
                                                    this.f83372z = i36;
                                                    this.A = i29;
                                                    this.E = 3;
                                                    objK = fVar.k(string, this);
                                                    if (objK != objE) {
                                                        zz.e eVar5 = eVar2;
                                                        str4 = strI1;
                                                        i37 = i29;
                                                        uri3 = uri2;
                                                        eVar3 = eVar5;
                                                        str5 = strS1;
                                                        obj = objK;
                                                        bVar7 = bVar6;
                                                        jVar4 = jVar3;
                                                        r16 = params3;
                                                        if (obj == null) {
                                                            bVar7.b(gVar3.o());
                                                            throw new oq.g();
                                                        }
                                                        fFloatValue = ((Number) obj).floatValue();
                                                        eVar4 = eVar3;
                                                        i38 = i36;
                                                        iVarA2 = gVar3.checkFileSizeUseCase.a(new bc4.b.Params(fFloatValue, r16.getMaxSizeInBytes()));
                                                        if (iVarA2 instanceof dx.i.Left) {
                                                            if (!(iVarA2 instanceof dx.i.Right)) {
                                                                throw new oq.p();
                                                            }
                                                            i0 i0Var = (i0) ((dx.i.Right) iVarA2).b();
                                                            az.f fVar2 = gVar3.fileDataManager;
                                                            String string2 = uri3.toString();
                                                            g gVar6 = gVar3;
                                                            this.f83354e = gVar6;
                                                            gVar3 = gVar6;
                                                            r17 = r16;
                                                            this.f83355f = r17;
                                                            this.f83356g = jVar4;
                                                            this.f83357h = vq.j.a(bVar3);
                                                            this.f83358j = bVar6;
                                                            this.f83359k = vq.j.a(eVar4);
                                                            this.f83360l = uri3;
                                                            this.f83361m = str5;
                                                            this.f83362n = str4;
                                                            this.f83363p = bVar6;
                                                            this.f83364q = vq.j.a(iVarA2);
                                                            this.f83365r = str3;
                                                            this.f83366s = vq.j.a(i0Var);
                                                            this.f83367t = bVar6;
                                                            this.f83368v = i26;
                                                            this.f83369w = i27;
                                                            this.f83370x = i28;
                                                            this.f83371y = i35;
                                                            this.f83372z = i38;
                                                            this.A = i37;
                                                            this.D = fFloatValue;
                                                            z15 = false;
                                                            this.B = 0;
                                                            this.C = 0;
                                                            this.E = 4;
                                                            objM = fVar2.m(string2, this);
                                                            if (objM == objE) {
                                                                return objE;
                                                            }
                                                            uri4 = uri3;
                                                            bVar8 = bVar6;
                                                            bVar9 = bVar8;
                                                            r18 = r17;
                                                            objA = ((dx.i) objM).a();
                                                            if (objA != null) {
                                                                bVar6.b(gVar3.o());
                                                                throw new oq.g();
                                                            }
                                                            bArr = (byte[]) objA;
                                                            listB = r18.b();
                                                            if (listB instanceof Collection) {
                                                                it = listB.iterator();
                                                                while (true) {
                                                                    if (!it.hasNext()) {
                                                                        z16 = z15;
                                                                        break;
                                                                    }
                                                                    regular = (wx.i.Regular) it.next();
                                                                    if (!Arrays.equals(regular.getFileContent().getBytes(), bArr)) {
                                                                    }
                                                                }
                                                            } else {
                                                                it = listB.iterator();
                                                                while (true) {
                                                                    if (!it.hasNext()) {
                                                                        z16 = z15;
                                                                        break;
                                                                    }
                                                                    regular = (wx.i.Regular) it.next();
                                                                    if (!Arrays.equals(regular.getFileContent().getBytes(), bArr)) {
                                                                    }
                                                                }
                                                            }
                                                            if (!z16) {
                                                                bVar9.b(gVar3.l());
                                                                throw new oq.g();
                                                            }
                                                            iVarA2 = new dx.i.Right<>(new bc4.h.Result(new wx.i.Regular(new FilePickerMetadata(str5, str4, fFloatValue, uri4.toString()), new FileContent(bArr))));
                                                            bVar6 = bVar8;
                                                            bVar2 = bVar9;
                                                            return new dx.i.Left((dx.b) ex.d.a(e));
                                                        }
                                                        bVar2 = bVar6;
                                                        gVar = gVar3;
                                                        result = (bc4.h.Result) bVar6.a(iVarA2);
                                                        if (result != null) {
                                                            return new dx.i.Right(result);
                                                        }
                                                        bVar2.b(gVar.n());
                                                        throw new oq.g();
                                                    }
                                                    return objE;
                                                } catch (ex.c e15) {
                                                    e = e15;
                                                    jVar2 = jVar3;
                                                } catch (CancellationException e16) {
                                                    e = e16;
                                                    jVar2 = jVar3;
                                                    throw e;
                                                } catch (Exception e17) {
                                                    e = e17;
                                                    jVar2 = jVar3;
                                                    r15 = jVar2;
                                                    px.f fVar3 = px.f.f163100a;
                                                    message = e.getMessage();
                                                    if (message == null) {
                                                        str2 = str;
                                                    } else {
                                                        str2 = message;
                                                    }
                                                    fVar3.d(str2, e, px.c.a(r15));
                                                    iVarA = r15.a(e);
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
                                            } catch (ex.c e18) {
                                                e = e18;
                                            } catch (CancellationException e19) {
                                                e = e19;
                                            } catch (Exception e25) {
                                                e = e25;
                                                str = "";
                                            }
                                        } catch (ex.c e26) {
                                            e = e26;
                                        } catch (CancellationException e27) {
                                            e = e27;
                                        } catch (Exception e28) {
                                            e = e28;
                                        }
                                    } catch (ex.c e29) {
                                        e = e29;
                                    } catch (CancellationException e35) {
                                        throw e35;
                                    } catch (Exception e36) {
                                        e = e36;
                                        str = "";
                                        r15 = jVar6;
                                        px.f fVar4 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            str2 = str;
                                        } else {
                                            str2 = message;
                                        }
                                        fVar4.d(str2, e, px.c.a(r15));
                                        iVarA = r15.a(e);
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
                                } else if (i39 == 3) {
                                    i37 = this.A;
                                    int i66 = this.f83372z;
                                    int i67 = this.f83371y;
                                    int i68 = this.f83370x;
                                    int i69 = this.f83369w;
                                    int i75 = this.f83368v;
                                    String str6 = (String) this.f83364q;
                                    ex.b bVar16 = (ex.b) this.f83363p;
                                    str4 = (String) this.f83362n;
                                    str5 = (String) this.f83361m;
                                    uri3 = (Uri) this.f83360l;
                                    eVar3 = (zz.e) this.f83359k;
                                    ex.b bVar17 = (ex.b) this.f83358j;
                                    ex.b bVar18 = (ex.b) this.f83357h;
                                    dx.j<dx.b> jVar7 = (dx.j) this.f83356g;
                                    bc4.h.Params params6 = (bc4.h.Params) this.f83355f;
                                    g gVar7 = (g) this.f83354e;
                                    try {
                                        u.b(obj);
                                        gVar3 = gVar7;
                                        bVar7 = bVar16;
                                        i26 = i75;
                                        i28 = i68;
                                        bVar6 = bVar17;
                                        i36 = i66;
                                        r16 = params6;
                                        str = "";
                                        jVar4 = jVar7;
                                        bVar3 = bVar18;
                                        i35 = i67;
                                        str3 = str6;
                                        i27 = i69;
                                        try {
                                            if (obj == null) {
                                                bVar7.b(gVar3.o());
                                                throw new oq.g();
                                            }
                                            try {
                                                fFloatValue = ((Number) obj).floatValue();
                                                eVar4 = eVar3;
                                                i38 = i36;
                                                iVarA2 = gVar3.checkFileSizeUseCase.a(new bc4.b.Params(fFloatValue, r16.getMaxSizeInBytes()));
                                                if (iVarA2 instanceof dx.i.Left) {
                                                    if (!(iVarA2 instanceof dx.i.Right)) {
                                                        throw new oq.p();
                                                    }
                                                    i0 i0Var2 = (i0) ((dx.i.Right) iVarA2).b();
                                                    az.f fVar5 = gVar3.fileDataManager;
                                                    String string3 = uri3.toString();
                                                    g gVar8 = gVar3;
                                                    this.f83354e = gVar8;
                                                    gVar3 = gVar8;
                                                    r17 = r16;
                                                    this.f83355f = r17;
                                                    this.f83356g = jVar4;
                                                    this.f83357h = vq.j.a(bVar3);
                                                    this.f83358j = bVar6;
                                                    this.f83359k = vq.j.a(eVar4);
                                                    this.f83360l = uri3;
                                                    this.f83361m = str5;
                                                    this.f83362n = str4;
                                                    this.f83363p = bVar6;
                                                    this.f83364q = vq.j.a(iVarA2);
                                                    this.f83365r = str3;
                                                    this.f83366s = vq.j.a(i0Var2);
                                                    this.f83367t = bVar6;
                                                    this.f83368v = i26;
                                                    this.f83369w = i27;
                                                    this.f83370x = i28;
                                                    this.f83371y = i35;
                                                    this.f83372z = i38;
                                                    this.A = i37;
                                                    this.D = fFloatValue;
                                                    z15 = false;
                                                    this.B = 0;
                                                    this.C = 0;
                                                    this.E = 4;
                                                    objM = fVar5.m(string3, this);
                                                    if (objM == objE) {
                                                        return objE;
                                                    }
                                                    uri4 = uri3;
                                                    bVar8 = bVar6;
                                                    bVar9 = bVar8;
                                                    r18 = r17;
                                                    objA = ((dx.i) objM).a();
                                                    if (objA != null) {
                                                        bVar6.b(gVar3.o());
                                                        throw new oq.g();
                                                    }
                                                    bArr = (byte[]) objA;
                                                    listB = r18.b();
                                                    if (listB instanceof Collection) {
                                                        it = listB.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                z16 = z15;
                                                                break;
                                                            }
                                                            regular = (wx.i.Regular) it.next();
                                                            if (!Arrays.equals(regular.getFileContent().getBytes(), bArr)) {
                                                            }
                                                        }
                                                    } else {
                                                        it = listB.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                z16 = z15;
                                                                break;
                                                            }
                                                            regular = (wx.i.Regular) it.next();
                                                            if (!Arrays.equals(regular.getFileContent().getBytes(), bArr)) {
                                                            }
                                                        }
                                                    }
                                                    if (!z16) {
                                                        bVar9.b(gVar3.l());
                                                        throw new oq.g();
                                                    }
                                                    iVarA2 = new dx.i.Right<>(new bc4.h.Result(new wx.i.Regular(new FilePickerMetadata(str5, str4, fFloatValue, uri4.toString()), new FileContent(bArr))));
                                                    bVar6 = bVar8;
                                                    bVar2 = bVar9;
                                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                                }
                                                bVar2 = bVar6;
                                                gVar = gVar3;
                                                result = (bc4.h.Result) bVar6.a(iVarA2);
                                                if (result != null) {
                                                    return new dx.i.Right(result);
                                                }
                                                bVar2.b(gVar.n());
                                                throw new oq.g();
                                            } catch (ex.c e37) {
                                                e = e37;
                                                r16 = jVar4;
                                            } catch (CancellationException e38) {
                                                e = e38;
                                                r16 = jVar4;
                                                throw e;
                                            } catch (Exception e39) {
                                                e = e39;
                                                r16 = jVar4;
                                                r15 = r16;
                                                px.f fVar6 = px.f.f163100a;
                                                message = e.getMessage();
                                                if (message == null) {
                                                    str2 = str;
                                                } else {
                                                    str2 = message;
                                                }
                                                fVar6.d(str2, e, px.c.a(r15));
                                                iVarA = r15.a(e);
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
                                        } catch (ex.c e45) {
                                            e = e45;
                                        } catch (CancellationException e46) {
                                            e = e46;
                                        } catch (Exception e47) {
                                            e = e47;
                                        }
                                    } catch (ex.c e48) {
                                        e = e48;
                                    } catch (CancellationException e49) {
                                        throw e49;
                                    } catch (Exception e55) {
                                        e = e55;
                                        str = "";
                                        r15 = jVar7;
                                        px.f fVar7 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            str2 = str;
                                        } else {
                                            str2 = message;
                                        }
                                        fVar7.d(str2, e, px.c.a(r15));
                                        iVarA = r15.a(e);
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
                                    if (i39 != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    float f15 = this.D;
                                    ex.b bVar19 = (ex.b) this.f83367t;
                                    String str7 = (String) this.f83365r;
                                    bVar8 = (ex.b) this.f83363p;
                                    String str8 = (String) this.f83362n;
                                    String str9 = (String) this.f83361m;
                                    uri4 = (Uri) this.f83360l;
                                    bVar9 = (ex.b) this.f83358j;
                                    bc4.h.Params params7 = (bc4.h.Params) this.f83355f;
                                    g gVar9 = (g) this.f83354e;
                                    u.b(obj);
                                    str5 = str9;
                                    gVar3 = gVar9;
                                    bVar6 = bVar19;
                                    str4 = str8;
                                    objM = obj;
                                    str3 = str7;
                                    fFloatValue = f15;
                                    z15 = false;
                                    r18 = params7;
                                    try {
                                        objA = ((dx.i) objM).a();
                                        if (objA != null) {
                                            bVar6.b(gVar3.o());
                                            throw new oq.g();
                                        }
                                        bArr = (byte[]) objA;
                                        listB = r18.b();
                                        if ((listB instanceof Collection) && listB.isEmpty()) {
                                            z16 = z15;
                                            break;
                                        }
                                        it = listB.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z16 = z15;
                                                break;
                                            }
                                            regular = (wx.i.Regular) it.next();
                                            if (!Arrays.equals(regular.getFileContent().getBytes(), bArr) && t.c(wx.j.a(regular), str3)) {
                                                z16 = true;
                                                break;
                                            }
                                        }
                                        if (!z16) {
                                            bVar9.b(gVar3.l());
                                            throw new oq.g();
                                        }
                                        iVarA2 = new dx.i.Right<>(new bc4.h.Result(new wx.i.Regular(new FilePickerMetadata(str5, str4, fFloatValue, uri4.toString()), new FileContent(bArr))));
                                        bVar6 = bVar8;
                                        bVar2 = bVar9;
                                        gVar = gVar3;
                                        result = (bc4.h.Result) bVar6.a(iVarA2);
                                        if (result != null) {
                                            return new dx.i.Right(result);
                                        }
                                        bVar2.b(gVar.n());
                                        throw new oq.g();
                                    } catch (ex.c e56) {
                                        e = e56;
                                    } catch (CancellationException e57) {
                                        throw e57;
                                    }
                                }
                                if (t.c(eVar, zz.e.a.f238544a)) {
                                    bVar2.b(gVar.k());
                                    throw new oq.g();
                                }
                                if (!(eVar instanceof zz.e.UriResult)) {
                                    throw new oq.p();
                                }
                                Uri uri6 = ((zz.e.UriResult) eVar).getUri();
                                if (uri6 != null) {
                                    az.f fVar8 = gVar.fileDataManager;
                                    bVar3 = bVar;
                                    String string4 = uri6.toString();
                                    this.f83354e = gVar;
                                    this.f83355f = params;
                                    this.f83356g = jVar;
                                    g gVar10 = gVar;
                                    this.f83357h = vq.j.a(bVar3);
                                    this.f83358j = bVar2;
                                    this.f83359k = vq.j.a(eVar);
                                    this.f83360l = uri6;
                                    this.f83361m = bVar2;
                                    this.f83368v = i19;
                                    this.f83369w = i18;
                                    this.f83370x = i17;
                                    this.f83371y = i16;
                                    this.f83372z = i15;
                                    this.A = 0;
                                    i25 = 2;
                                    this.E = 2;
                                    objF = fVar8.f(string4, this);
                                    if (objF != objE) {
                                        i26 = i19;
                                        bVar4 = bVar2;
                                        jVar2 = jVar;
                                        eVar2 = eVar;
                                        uri = uri6;
                                        i27 = i18;
                                        bVar5 = bVar4;
                                        params2 = params;
                                        i28 = i17;
                                        i29 = 0;
                                        i35 = i16;
                                        i36 = i15;
                                        gVar2 = gVar10;
                                        if (objF != null) {
                                            bVar5.b(gVar2.o());
                                            throw new oq.g();
                                        }
                                        str3 = (String) objF;
                                        strS1 = r.s1(str3, ".", null, i25, null);
                                        strI1 = r.i1(str3, ".", "");
                                        az.f fVar9 = gVar2.fileDataManager;
                                        str = "";
                                        String string5 = uri.toString();
                                        this.f83354e = gVar2;
                                        this.f83355f = params2;
                                        gVar3 = gVar2;
                                        jVar3 = jVar2;
                                        this.f83356g = jVar3;
                                        this.f83357h = vq.j.a(bVar3);
                                        bVar6 = bVar4;
                                        this.f83358j = bVar6;
                                        params3 = params2;
                                        this.f83359k = vq.j.a(eVar2);
                                        uri2 = uri;
                                        this.f83360l = uri2;
                                        this.f83361m = strS1;
                                        this.f83362n = strI1;
                                        this.f83363p = bVar6;
                                        this.f83364q = str3;
                                        this.f83368v = i26;
                                        this.f83369w = i27;
                                        this.f83370x = i28;
                                        this.f83371y = i35;
                                        this.f83372z = i36;
                                        this.A = i29;
                                        this.E = 3;
                                        objK = fVar9.k(string5, this);
                                        if (objK != objE) {
                                            zz.e eVar6 = eVar2;
                                            str4 = strI1;
                                            i37 = i29;
                                            uri3 = uri2;
                                            eVar3 = eVar6;
                                            str5 = strS1;
                                            obj = objK;
                                            bVar7 = bVar6;
                                            jVar4 = jVar3;
                                            r16 = params3;
                                            if (obj == null) {
                                                bVar7.b(gVar3.o());
                                                throw new oq.g();
                                            }
                                            fFloatValue = ((Number) obj).floatValue();
                                            eVar4 = eVar3;
                                            i38 = i36;
                                            iVarA2 = gVar3.checkFileSizeUseCase.a(new bc4.b.Params(fFloatValue, r16.getMaxSizeInBytes()));
                                            if (iVarA2 instanceof dx.i.Left) {
                                                bVar2 = bVar6;
                                            } else {
                                                if (!(iVarA2 instanceof dx.i.Right)) {
                                                    throw new oq.p();
                                                }
                                                i0 i0Var3 = (i0) ((dx.i.Right) iVarA2).b();
                                                az.f fVar10 = gVar3.fileDataManager;
                                                String string6 = uri3.toString();
                                                g gVar11 = gVar3;
                                                this.f83354e = gVar11;
                                                gVar3 = gVar11;
                                                r17 = r16;
                                                this.f83355f = r17;
                                                this.f83356g = jVar4;
                                                this.f83357h = vq.j.a(bVar3);
                                                this.f83358j = bVar6;
                                                this.f83359k = vq.j.a(eVar4);
                                                this.f83360l = uri3;
                                                this.f83361m = str5;
                                                this.f83362n = str4;
                                                this.f83363p = bVar6;
                                                this.f83364q = vq.j.a(iVarA2);
                                                this.f83365r = str3;
                                                this.f83366s = vq.j.a(i0Var3);
                                                this.f83367t = bVar6;
                                                this.f83368v = i26;
                                                this.f83369w = i27;
                                                this.f83370x = i28;
                                                this.f83371y = i35;
                                                this.f83372z = i38;
                                                this.A = i37;
                                                this.D = fFloatValue;
                                                z15 = false;
                                                this.B = 0;
                                                this.C = 0;
                                                this.E = 4;
                                                objM = fVar10.m(string6, this);
                                                if (objM == objE) {
                                                    return objE;
                                                }
                                                uri4 = uri3;
                                                bVar8 = bVar6;
                                                bVar9 = bVar8;
                                                r18 = r17;
                                                objA = ((dx.i) objM).a();
                                                if (objA != null) {
                                                    bVar6.b(gVar3.o());
                                                    throw new oq.g();
                                                }
                                                bArr = (byte[]) objA;
                                                listB = r18.b();
                                                if (listB instanceof Collection) {
                                                    it = listB.iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            z16 = z15;
                                                            break;
                                                        }
                                                        regular = (wx.i.Regular) it.next();
                                                        if (!Arrays.equals(regular.getFileContent().getBytes(), bArr)) {
                                                        }
                                                    }
                                                } else {
                                                    it = listB.iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            z16 = z15;
                                                            break;
                                                        }
                                                        regular = (wx.i.Regular) it.next();
                                                        if (!Arrays.equals(regular.getFileContent().getBytes(), bArr)) {
                                                        }
                                                    }
                                                }
                                                if (!z16) {
                                                    bVar9.b(gVar3.l());
                                                    throw new oq.g();
                                                }
                                                iVarA2 = new dx.i.Right<>(new bc4.h.Result(new wx.i.Regular(new FilePickerMetadata(str5, str4, fFloatValue, uri4.toString()), new FileContent(bArr))));
                                                bVar6 = bVar8;
                                                bVar2 = bVar9;
                                            }
                                            gVar = gVar3;
                                            result = (bc4.h.Result) bVar6.a(iVarA2);
                                            if (result != null) {
                                                return new dx.i.Right(result);
                                            }
                                        }
                                    }
                                    return objE;
                                }
                                bVar2.b(gVar.n());
                                throw new oq.g();
                            } catch (ex.c e58) {
                                e = e58;
                            } catch (CancellationException e59) {
                                e = e59;
                                throw e;
                            } catch (Exception e65) {
                                e = e65;
                                r15 = jVar;
                                px.f fVar11 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    str2 = str;
                                } else {
                                    str2 = message;
                                }
                                fVar11.d(str2, e, px.c.a(r15));
                                iVarA = r15.a(e);
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
                            eVar = (zz.e) objI;
                        } catch (ex.c e66) {
                            e = e66;
                        } catch (CancellationException e67) {
                            e = e67;
                        } catch (Exception e68) {
                            e = e68;
                            str = "";
                        }
                    } catch (Exception e69) {
                        e = e69;
                    }
                } catch (CancellationException e75) {
                    throw e75;
                }
            } catch (ex.c e76) {
                e = e76;
            } catch (CancellationException e77) {
                throw e77;
            } catch (Exception e78) {
                e = e78;
                str = "";
            }
            return new dx.i.Left((dx.b) ex.d.a(e));
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return g.this.new a(this.G, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, bc4.h.Result>> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    public g(zz.b bVar, az.f fVar, bc4.b bVar2, ac4.a aVar, mx.c cVar) {
        this.pickFileManager = bVar;
        this.fileDataManager = fVar;
        this.checkFileSizeUseCase = bVar2;
        this.callActionWithLoaderUseCase = aVar;
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business k() {
        return new dx.b.Business(zb4.b.ACTIVITY_NOT_FOUND, null, this.labelProvider.c(xb4.a.f217905c), this.labelProvider.c(xb4.a.f217922t), null, this.labelProvider.c(xb4.a.f217904b), null, 82, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business l() {
        return new dx.b.Business(zb4.b.FILE_ALREADY_PICKED, null, this.labelProvider.c(xb4.a.f217907e), this.labelProvider.c(xb4.a.f217906d), null, this.labelProvider.c(xb4.a.f217904b), null, 82, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business n() {
        return new dx.b.Business(zb4.b.NO_FILE_PICKED, null, Label.INSTANCE.c(), null, null, this.labelProvider.c(xb4.a.f217904b), null, 90, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.b.Business o() {
        return new dx.b.Business(zb4.b.FILE_DATA_ERROR, null, this.labelProvider.c(xb4.a.f217926x), null, null, this.labelProvider.c(xb4.a.f217904b), null, 90, null);
    }

    @Override // gz.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Object c(bc4.h.Params params, tq.e<? super dx.i<? extends dx.b, bc4.h.Result>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(params, null), eVar, 1, null);
    }
}
