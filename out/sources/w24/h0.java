package w24;

import f24.DocumentScope;
import i24.RailwayCardContainerData;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lw24/h0;", "Lw24/g0;", "Lv24/b;", "documentsContainerRepository", "Liy/a;", "base64Coder", "<init>", "(Lv24/b;Liy/a;)V", "Lw24/g0$a;", "params", "Ldx/i;", "Ldx/b;", "", "d", "(Lw24/g0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lv24/b;", "b", "Liy/a;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {
        int B;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209631f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209632g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f209633h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f209634j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f209635k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f209636l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f209637m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f209638n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f209639p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f209640q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f209641r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f209642s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f209643t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f209644v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f209645w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f209646x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f209647y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        /* synthetic */ Object f209648z;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209648z = obj;
            this.B |= PKIFailureInfo.systemUnavail;
            return h0.this.c(null, this);
        }
    }

    public h0(v24.b bVar, iy.a aVar) {
        this.documentsContainerRepository = bVar;
        this.base64Coder = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x036c A[Catch: Exception -> 0x0357, c -> 0x035c, CancellationException -> 0x0361, TryCatch #17 {c -> 0x035c, CancellationException -> 0x0361, Exception -> 0x0357, blocks: (B:134:0x04ea, B:137:0x04f5, B:139:0x04f9, B:147:0x056a, B:148:0x056f, B:106:0x03e1, B:109:0x03ed, B:111:0x03f1, B:126:0x0474, B:127:0x0479, B:74:0x02c3, B:77:0x02cf, B:79:0x02d3, B:98:0x0366, B:99:0x036b, B:70:0x026d, B:100:0x036c, B:102:0x037c, B:128:0x047a, B:130:0x048b, B:149:0x0570), top: B:186:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x037c A[Catch: Exception -> 0x0357, c -> 0x035c, CancellationException -> 0x0361, TryCatch #17 {c -> 0x035c, CancellationException -> 0x0361, Exception -> 0x0357, blocks: (B:134:0x04ea, B:137:0x04f5, B:139:0x04f9, B:147:0x056a, B:148:0x056f, B:106:0x03e1, B:109:0x03ed, B:111:0x03f1, B:126:0x0474, B:127:0x0479, B:74:0x02c3, B:77:0x02cf, B:79:0x02d3, B:98:0x0366, B:99:0x036b, B:70:0x026d, B:100:0x036c, B:102:0x037c, B:128:0x047a, B:130:0x048b, B:149:0x0570), top: B:186:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:105:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:108:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:109:0x03ed A[Catch: Exception -> 0x0357, c -> 0x035c, CancellationException -> 0x0361, TryCatch #17 {c -> 0x035c, CancellationException -> 0x0361, Exception -> 0x0357, blocks: (B:134:0x04ea, B:137:0x04f5, B:139:0x04f9, B:147:0x056a, B:148:0x056f, B:106:0x03e1, B:109:0x03ed, B:111:0x03f1, B:126:0x0474, B:127:0x0479, B:74:0x02c3, B:77:0x02cf, B:79:0x02d3, B:98:0x0366, B:99:0x036b, B:70:0x026d, B:100:0x036c, B:102:0x037c, B:128:0x047a, B:130:0x048b, B:149:0x0570), top: B:186:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x03f1 A[Catch: Exception -> 0x0357, c -> 0x035c, CancellationException -> 0x0361, TRY_LEAVE, TryCatch #17 {c -> 0x035c, CancellationException -> 0x0361, Exception -> 0x0357, blocks: (B:134:0x04ea, B:137:0x04f5, B:139:0x04f9, B:147:0x056a, B:148:0x056f, B:106:0x03e1, B:109:0x03ed, B:111:0x03f1, B:126:0x0474, B:127:0x0479, B:74:0x02c3, B:77:0x02cf, B:79:0x02d3, B:98:0x0366, B:99:0x036b, B:70:0x026d, B:100:0x036c, B:102:0x037c, B:128:0x047a, B:130:0x048b, B:149:0x0570), top: B:186:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x044c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0474 A[Catch: Exception -> 0x0357, c -> 0x035c, CancellationException -> 0x0361, TRY_ENTER, TryCatch #17 {c -> 0x035c, CancellationException -> 0x0361, Exception -> 0x0357, blocks: (B:134:0x04ea, B:137:0x04f5, B:139:0x04f9, B:147:0x056a, B:148:0x056f, B:106:0x03e1, B:109:0x03ed, B:111:0x03f1, B:126:0x0474, B:127:0x0479, B:74:0x02c3, B:77:0x02cf, B:79:0x02d3, B:98:0x0366, B:99:0x036b, B:70:0x026d, B:100:0x036c, B:102:0x037c, B:128:0x047a, B:130:0x048b, B:149:0x0570), top: B:186:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x047a A[Catch: Exception -> 0x0357, c -> 0x035c, CancellationException -> 0x0361, TryCatch #17 {c -> 0x035c, CancellationException -> 0x0361, Exception -> 0x0357, blocks: (B:134:0x04ea, B:137:0x04f5, B:139:0x04f9, B:147:0x056a, B:148:0x056f, B:106:0x03e1, B:109:0x03ed, B:111:0x03f1, B:126:0x0474, B:127:0x0479, B:74:0x02c3, B:77:0x02cf, B:79:0x02d3, B:98:0x0366, B:99:0x036b, B:70:0x026d, B:100:0x036c, B:102:0x037c, B:128:0x047a, B:130:0x048b, B:149:0x0570), top: B:186:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x048b A[Catch: Exception -> 0x0357, c -> 0x035c, CancellationException -> 0x0361, TryCatch #17 {c -> 0x035c, CancellationException -> 0x0361, Exception -> 0x0357, blocks: (B:134:0x04ea, B:137:0x04f5, B:139:0x04f9, B:147:0x056a, B:148:0x056f, B:106:0x03e1, B:109:0x03ed, B:111:0x03f1, B:126:0x0474, B:127:0x0479, B:74:0x02c3, B:77:0x02cf, B:79:0x02d3, B:98:0x0366, B:99:0x036b, B:70:0x026d, B:100:0x036c, B:102:0x037c, B:128:0x047a, B:130:0x048b, B:149:0x0570), top: B:186:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:133:0x04da  */
    /* JADX WARN: Code duplicated, block: B:136:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:137:0x04f5 A[Catch: Exception -> 0x0357, c -> 0x035c, CancellationException -> 0x0361, TryCatch #17 {c -> 0x035c, CancellationException -> 0x0361, Exception -> 0x0357, blocks: (B:134:0x04ea, B:137:0x04f5, B:139:0x04f9, B:147:0x056a, B:148:0x056f, B:106:0x03e1, B:109:0x03ed, B:111:0x03f1, B:126:0x0474, B:127:0x0479, B:74:0x02c3, B:77:0x02cf, B:79:0x02d3, B:98:0x0366, B:99:0x036b, B:70:0x026d, B:100:0x036c, B:102:0x037c, B:128:0x047a, B:130:0x048b, B:149:0x0570), top: B:186:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x04f9 A[Catch: Exception -> 0x0357, c -> 0x035c, CancellationException -> 0x0361, TRY_LEAVE, TryCatch #17 {c -> 0x035c, CancellationException -> 0x0361, Exception -> 0x0357, blocks: (B:134:0x04ea, B:137:0x04f5, B:139:0x04f9, B:147:0x056a, B:148:0x056f, B:106:0x03e1, B:109:0x03ed, B:111:0x03f1, B:126:0x0474, B:127:0x0479, B:74:0x02c3, B:77:0x02cf, B:79:0x02d3, B:98:0x0366, B:99:0x036b, B:70:0x026d, B:100:0x036c, B:102:0x037c, B:128:0x047a, B:130:0x048b, B:149:0x0570), top: B:186:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0554  */
    /* JADX WARN: Code duplicated, block: B:147:0x056a A[Catch: Exception -> 0x0357, c -> 0x035c, CancellationException -> 0x0361, TRY_ENTER, TryCatch #17 {c -> 0x035c, CancellationException -> 0x0361, Exception -> 0x0357, blocks: (B:134:0x04ea, B:137:0x04f5, B:139:0x04f9, B:147:0x056a, B:148:0x056f, B:106:0x03e1, B:109:0x03ed, B:111:0x03f1, B:126:0x0474, B:127:0x0479, B:74:0x02c3, B:77:0x02cf, B:79:0x02d3, B:98:0x0366, B:99:0x036b, B:70:0x026d, B:100:0x036c, B:102:0x037c, B:128:0x047a, B:130:0x048b, B:149:0x0570), top: B:186:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0570 A[Catch: Exception -> 0x0357, c -> 0x035c, CancellationException -> 0x0361, TRY_LEAVE, TryCatch #17 {c -> 0x035c, CancellationException -> 0x0361, Exception -> 0x0357, blocks: (B:134:0x04ea, B:137:0x04f5, B:139:0x04f9, B:147:0x056a, B:148:0x056f, B:106:0x03e1, B:109:0x03ed, B:111:0x03f1, B:126:0x0474, B:127:0x0479, B:74:0x02c3, B:77:0x02cf, B:79:0x02d3, B:98:0x0366, B:99:0x036b, B:70:0x026d, B:100:0x036c, B:102:0x037c, B:128:0x047a, B:130:0x048b, B:149:0x0570), top: B:186:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0580  */
    /* JADX WARN: Code duplicated, block: B:155:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:158:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:161:0x05d4 A[Catch: Exception -> 0x01ff, c -> 0x0203, CancellationException -> 0x0207, TRY_LEAVE, TryCatch #12 {c -> 0x0203, CancellationException -> 0x0207, Exception -> 0x01ff, blocks: (B:53:0x01f4, B:66:0x0250, B:68:0x0256, B:152:0x0582, B:159:0x05cb, B:161:0x05d4, B:166:0x05f1, B:167:0x05f6), top: B:188:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x05f1 A[Catch: Exception -> 0x01ff, c -> 0x0203, CancellationException -> 0x0207, TRY_ENTER, TryCatch #12 {c -> 0x0203, CancellationException -> 0x0207, Exception -> 0x01ff, blocks: (B:53:0x01f4, B:66:0x0250, B:68:0x0256, B:152:0x0582, B:159:0x05cb, B:161:0x05d4, B:166:0x05f1, B:167:0x05f6), top: B:188:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x060e  */
    /* JADX WARN: Code duplicated, block: B:177:0x061f  */
    /* JADX WARN: Code duplicated, block: B:178:0x062d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0631  */
    /* JADX WARN: Code duplicated, block: B:183:0x063e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0256 A[Catch: Exception -> 0x01ff, c -> 0x0203, CancellationException -> 0x0207, TRY_LEAVE, TryCatch #12 {c -> 0x0203, CancellationException -> 0x0207, Exception -> 0x01ff, blocks: (B:53:0x01f4, B:66:0x0250, B:68:0x0256, B:152:0x0582, B:159:0x05cb, B:161:0x05d4, B:166:0x05f1, B:167:0x05f6), top: B:188:0x01f4 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x026d A[Catch: Exception -> 0x0357, c -> 0x035c, CancellationException -> 0x0361, TRY_ENTER, TryCatch #17 {c -> 0x035c, CancellationException -> 0x0361, Exception -> 0x0357, blocks: (B:134:0x04ea, B:137:0x04f5, B:139:0x04f9, B:147:0x056a, B:148:0x056f, B:106:0x03e1, B:109:0x03ed, B:111:0x03f1, B:126:0x0474, B:127:0x0479, B:74:0x02c3, B:77:0x02cf, B:79:0x02d3, B:98:0x0366, B:99:0x036b, B:70:0x026d, B:100:0x036c, B:102:0x037c, B:128:0x047a, B:130:0x048b, B:149:0x0570), top: B:186:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:76:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x02cf A[Catch: Exception -> 0x0357, c -> 0x035c, CancellationException -> 0x0361, TryCatch #17 {c -> 0x035c, CancellationException -> 0x0361, Exception -> 0x0357, blocks: (B:134:0x04ea, B:137:0x04f5, B:139:0x04f9, B:147:0x056a, B:148:0x056f, B:106:0x03e1, B:109:0x03ed, B:111:0x03f1, B:126:0x0474, B:127:0x0479, B:74:0x02c3, B:77:0x02cf, B:79:0x02d3, B:98:0x0366, B:99:0x036b, B:70:0x026d, B:100:0x036c, B:102:0x037c, B:128:0x047a, B:130:0x048b, B:149:0x0570), top: B:186:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x02d3 A[Catch: Exception -> 0x0357, c -> 0x035c, CancellationException -> 0x0361, TRY_LEAVE, TryCatch #17 {c -> 0x035c, CancellationException -> 0x0361, Exception -> 0x0357, blocks: (B:134:0x04ea, B:137:0x04f5, B:139:0x04f9, B:147:0x056a, B:148:0x056f, B:106:0x03e1, B:109:0x03ed, B:111:0x03f1, B:126:0x0474, B:127:0x0479, B:74:0x02c3, B:77:0x02cf, B:79:0x02d3, B:98:0x0366, B:99:0x036b, B:70:0x026d, B:100:0x036c, B:102:0x037c, B:128:0x047a, B:130:0x048b, B:149:0x0570), top: B:186:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0330  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:98:0x0366 A[Catch: Exception -> 0x0357, c -> 0x035c, CancellationException -> 0x0361, TRY_ENTER, TryCatch #17 {c -> 0x035c, CancellationException -> 0x0361, Exception -> 0x0357, blocks: (B:134:0x04ea, B:137:0x04f5, B:139:0x04f9, B:147:0x056a, B:148:0x056f, B:106:0x03e1, B:109:0x03ed, B:111:0x03f1, B:126:0x0474, B:127:0x0479, B:74:0x02c3, B:77:0x02cf, B:79:0x02d3, B:98:0x0366, B:99:0x036b, B:70:0x026d, B:100:0x036c, B:102:0x037c, B:128:0x047a, B:130:0x048b, B:149:0x0570), top: B:186:0x0026 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x00da: MOVE (r3 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:35:0x00da */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x00df: MOVE (r3 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:37:0x00df */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x00e4: MOVE (r3 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:39:0x00e4 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v104 */
    /* JADX WARN: Type inference failed for: r3v105 */
    /* JADX WARN: Type inference failed for: r3v106 */
    /* JADX WARN: Type inference failed for: r3v107 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r3v93 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(g0.Params params, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
        a aVar;
        Object obj;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b bVar;
        ex.b bVar2;
        dx.j<dx.b> jVar;
        g0.Params params2;
        int i15;
        int i16;
        int i17;
        int i18;
        ex.b bVar3;
        int i19;
        dx.i left;
        dx.b bVar4;
        ex.b bVar5;
        g0.Params params3;
        ex.b bVar6;
        int i25;
        int i26;
        int i27;
        ex.b bVar7;
        dx.j<dx.b> jVar2;
        Object objD;
        dx.i iVar;
        int i28;
        int i29;
        g0.Params params4;
        ex.b bVar8;
        int i35;
        int i36;
        dx.b bVar9;
        int i37;
        int i38;
        ex.b bVar10;
        int i39;
        ex.b bVar11;
        int i45;
        int i46;
        Object objD2;
        dx.b bVar12;
        g0.Params params5;
        int i47;
        int i48;
        int i49;
        int i55;
        ex.b bVar13;
        int i56;
        int i57;
        ex.b bVar14;
        dx.i iVar2;
        int i58;
        ex.b bVar15;
        g0.Params params6;
        Object objF;
        int i59;
        int i65;
        dx.i iVar3;
        int i66;
        int i67;
        int i68;
        ex.b bVar16;
        ex.b bVar17;
        int i69;
        int i75;
        dx.j<dx.b> jVar3;
        dx.i right;
        dx.i iVar4;
        ex.b bVar18;
        dx.j<dx.b> jVar4;
        ex.b bVar19;
        dx.j<dx.b> jVar5;
        ?? r15;
        dx.j<dx.b> jVar6;
        dx.i right2;
        dx.i iVar5;
        dx.j<dx.b> jVar7;
        ex.b bVar20;
        ex.b bVar21;
        dx.j<dx.b> jVar8;
        dx.j<dx.b> jVar9;
        dx.i right3;
        g0.Params params7;
        ex.b bVar22;
        dx.j<dx.b> jVar10;
        ex.b bVar23;
        dx.j<dx.b> jVar11;
        ?? r16;
        h0 h0Var = this;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i76 = aVar.B;
            if ((i76 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.B = i76 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = h0Var.new a(eVar);
            }
        } else {
            aVar = h0Var.new a(eVar);
        }
        a aVar2 = aVar;
        Object objH = aVar2.f209648z;
        Object objE = uq.b.e();
        ?? r17 = aVar2.B;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        switch (r17) {
                                            case 0:
                                                oq.u.b(objH);
                                                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                                                ex.a aVar3 = new ex.a();
                                                v24.b bVar24 = h0Var.documentsContainerRepository;
                                                String scopeName = params.getScopeName();
                                                aVar2.f209629d = params;
                                                aVar2.f209630e = jVarA;
                                                aVar2.f209631f = vq.j.a(aVar3);
                                                aVar2.f209632g = aVar3;
                                                aVar2.f209633h = aVar3;
                                                aVar2.f209639p = 0;
                                                aVar2.f209640q = 0;
                                                aVar2.f209641r = 0;
                                                aVar2.f209642s = 0;
                                                aVar2.f209643t = 0;
                                                aVar2.B = 1;
                                                Object objH2 = bVar24.H(scopeName, aVar2);
                                                if (objH2 != objE) {
                                                    bVar = aVar3;
                                                    bVar2 = bVar;
                                                    jVar = jVarA;
                                                    params2 = params;
                                                    i15 = 0;
                                                    i16 = 0;
                                                    i17 = 0;
                                                    i18 = 0;
                                                    bVar3 = bVar2;
                                                    objH = objH2;
                                                    i19 = 0;
                                                    left = (dx.i) objH;
                                                    if (left instanceof dx.i.Left) {
                                                        bVar4 = (dx.b) ((dx.i.Left) left).b();
                                                        if (RailwayCardContainerData.INSTANCE.a(params2.getScopeName()) != null) {
                                                            v24.b bVar25 = h0Var.documentsContainerRepository;
                                                            f24.i iVar6 = f24.i.RAILWAY_CARD;
                                                            bVar15 = bVar2;
                                                            String scopeName2 = params2.getScopeName();
                                                            params6 = params2;
                                                            aVar2.f209629d = vq.j.a(params6);
                                                            aVar2.f209630e = jVar;
                                                            aVar2.f209631f = vq.j.a(bVar15);
                                                            aVar2.f209632g = vq.j.a(bVar3);
                                                            aVar2.f209633h = bVar;
                                                            aVar2.f209634j = vq.j.a(left);
                                                            aVar2.f209635k = vq.j.a(bVar4);
                                                            aVar2.f209636l = bVar3;
                                                            aVar2.f209639p = i15;
                                                            aVar2.f209640q = i19;
                                                            aVar2.f209641r = i18;
                                                            aVar2.f209642s = i17;
                                                            aVar2.f209643t = i16;
                                                            aVar2.f209644v = 0;
                                                            aVar2.f209645w = 0;
                                                            aVar2.B = 2;
                                                            objF = bVar25.f(iVar6, scopeName2, aVar2);
                                                            if (objF == objE) {
                                                                int i77 = i16;
                                                                i59 = i15;
                                                                i65 = i77;
                                                                iVar3 = left;
                                                                objH = objF;
                                                                i66 = i17;
                                                                i67 = i18;
                                                                i68 = 0;
                                                                bVar16 = bVar3;
                                                                bVar17 = bVar;
                                                                i69 = i19;
                                                                i75 = 0;
                                                                jVar3 = jVar;
                                                                right = (dx.i) objH;
                                                                iVar4 = iVar3;
                                                                if (!(right instanceof dx.i.Left)) {
                                                                    jVar5 = jVar3;
                                                                    bVar = bVar17;
                                                                } else {
                                                                    if (!(right instanceof dx.i.Right)) {
                                                                        throw new oq.p();
                                                                    }
                                                                    String str = (String) ((dx.i.Right) right).b();
                                                                    ex.b bVar26 = bVar16;
                                                                    v24.b bVar27 = h0Var.documentsContainerRepository;
                                                                    aVar2.f209629d = vq.j.a(params6);
                                                                    aVar2.f209630e = jVar3;
                                                                    aVar2.f209631f = vq.j.a(bVar15);
                                                                    aVar2.f209632g = vq.j.a(bVar26);
                                                                    aVar2.f209633h = bVar17;
                                                                    aVar2.f209634j = vq.j.a(iVar4);
                                                                    aVar2.f209635k = vq.j.a(bVar4);
                                                                    aVar2.f209636l = bVar3;
                                                                    aVar2.f209637m = vq.j.a(right);
                                                                    aVar2.f209638n = vq.j.a(str);
                                                                    aVar2.f209639p = i59;
                                                                    aVar2.f209640q = i69;
                                                                    aVar2.f209641r = i67;
                                                                    aVar2.f209642s = i66;
                                                                    aVar2.f209643t = i65;
                                                                    aVar2.f209644v = i68;
                                                                    aVar2.f209645w = i75;
                                                                    aVar2.f209646x = 0;
                                                                    aVar2.f209647y = 0;
                                                                    aVar2.B = 3;
                                                                    objH = bVar27.H(str, aVar2);
                                                                    if (objH != objE) {
                                                                        bVar18 = bVar3;
                                                                        jVar4 = jVar3;
                                                                        bVar19 = bVar17;
                                                                        right = new dx.i.Right((dx.i) objH);
                                                                        bVar = bVar19;
                                                                        bVar3 = bVar18;
                                                                        jVar5 = jVar4;
                                                                    }
                                                                }
                                                                left = (dx.i) bVar3.a(right);
                                                                h0Var = this;
                                                                r15 = jVar5;
                                                            }
                                                        } else {
                                                            bVar5 = bVar2;
                                                            params3 = params2;
                                                            if (fr.t.c(params3.getScopeName(), "RAILWAY_CARD_DOCUMENT_OWNER")) {
                                                                h0Var = this;
                                                                v24.b bVar28 = h0Var.documentsContainerRepository;
                                                                f24.i iVar7 = f24.i.RAILWAY_CARD;
                                                                aVar2.f209629d = vq.j.a(params3);
                                                                aVar2.f209630e = jVar;
                                                                aVar2.f209631f = vq.j.a(bVar5);
                                                                aVar2.f209632g = vq.j.a(bVar3);
                                                                aVar2.f209633h = bVar;
                                                                aVar2.f209634j = vq.j.a(left);
                                                                aVar2.f209635k = vq.j.a(bVar4);
                                                                aVar2.f209636l = bVar3;
                                                                aVar2.f209639p = i15;
                                                                aVar2.f209640q = i19;
                                                                aVar2.f209641r = i18;
                                                                aVar2.f209642s = i17;
                                                                aVar2.f209643t = i16;
                                                                aVar2.f209644v = 0;
                                                                aVar2.f209645w = 0;
                                                                aVar2.B = 4;
                                                                i39 = i15;
                                                                bVar11 = bVar3;
                                                                i45 = i19;
                                                                i46 = i16;
                                                                objD2 = v24.b.D(bVar28, iVar7, null, aVar2, 2, null);
                                                                if (objD2 == objE) {
                                                                    bVar12 = bVar4;
                                                                    params5 = params3;
                                                                    i47 = i17;
                                                                    i48 = i18;
                                                                    i49 = i46;
                                                                    i55 = 0;
                                                                    bVar13 = bVar;
                                                                    i56 = i45;
                                                                    i57 = i39;
                                                                    bVar14 = bVar11;
                                                                    iVar2 = left;
                                                                    objH = objD2;
                                                                    i58 = 0;
                                                                    jVar6 = jVar;
                                                                    right2 = (dx.i) objH;
                                                                    iVar5 = iVar2;
                                                                    if (!(right2 instanceof dx.i.Left)) {
                                                                        jVar8 = jVar6;
                                                                        bVar = bVar13;
                                                                    } else {
                                                                        if (!(right2 instanceof dx.i.Right)) {
                                                                            throw new oq.p();
                                                                        }
                                                                        String str2 = (String) ((dx.i.Right) right2).b();
                                                                        ex.b bVar29 = bVar14;
                                                                        v24.b bVar30 = h0Var.documentsContainerRepository;
                                                                        aVar2.f209629d = vq.j.a(params5);
                                                                        aVar2.f209630e = jVar6;
                                                                        aVar2.f209631f = vq.j.a(bVar5);
                                                                        aVar2.f209632g = vq.j.a(bVar29);
                                                                        aVar2.f209633h = bVar13;
                                                                        aVar2.f209634j = vq.j.a(iVar5);
                                                                        aVar2.f209635k = vq.j.a(bVar12);
                                                                        aVar2.f209636l = bVar11;
                                                                        aVar2.f209637m = vq.j.a(right2);
                                                                        aVar2.f209638n = vq.j.a(str2);
                                                                        aVar2.f209639p = i57;
                                                                        aVar2.f209640q = i56;
                                                                        aVar2.f209641r = i48;
                                                                        aVar2.f209642s = i47;
                                                                        aVar2.f209643t = i49;
                                                                        aVar2.f209644v = i58;
                                                                        aVar2.f209645w = i55;
                                                                        aVar2.f209646x = 0;
                                                                        aVar2.f209647y = 0;
                                                                        aVar2.B = 5;
                                                                        objH = bVar30.H(str2, aVar2);
                                                                        if (objH != objE) {
                                                                            jVar7 = jVar6;
                                                                            bVar20 = bVar11;
                                                                            bVar21 = bVar13;
                                                                            right2 = new dx.i.Right((dx.i) objH);
                                                                            bVar11 = bVar20;
                                                                            bVar = bVar21;
                                                                            jVar8 = jVar7;
                                                                        }
                                                                    }
                                                                    left = (dx.i) bVar11.a(right2);
                                                                    r17 = jVar8;
                                                                    h0Var = this;
                                                                    r16 = r17;
                                                                    r15 = r16;
                                                                }
                                                            } else {
                                                                bVar6 = bVar3;
                                                                i25 = i15;
                                                                i26 = i16;
                                                                i27 = i19;
                                                                if (fr.t.c(params3.getScopeName(), "FAMILY_CARD_DOCUMENT_OWNER")) {
                                                                    h0Var = this;
                                                                    v24.b bVar31 = h0Var.documentsContainerRepository;
                                                                    f24.i iVar8 = f24.i.FAMILY_CARD;
                                                                    aVar2.f209629d = vq.j.a(params3);
                                                                    aVar2.f209630e = jVar;
                                                                    aVar2.f209631f = vq.j.a(bVar5);
                                                                    aVar2.f209632g = vq.j.a(bVar6);
                                                                    aVar2.f209633h = bVar;
                                                                    aVar2.f209634j = vq.j.a(left);
                                                                    aVar2.f209635k = vq.j.a(bVar4);
                                                                    aVar2.f209636l = bVar6;
                                                                    aVar2.f209639p = i25;
                                                                    aVar2.f209640q = i27;
                                                                    aVar2.f209641r = i18;
                                                                    aVar2.f209642s = i17;
                                                                    aVar2.f209643t = i26;
                                                                    aVar2.f209644v = 0;
                                                                    aVar2.f209645w = 0;
                                                                    aVar2.B = 6;
                                                                    objD = v24.b.D(bVar31, iVar8, null, aVar2, 2, null);
                                                                    if (objD == objE) {
                                                                        iVar = left;
                                                                        objH = objD;
                                                                        i28 = i26;
                                                                        i29 = i18;
                                                                        params4 = params3;
                                                                        bVar8 = bVar6;
                                                                        i35 = 0;
                                                                        i36 = 0;
                                                                        bVar9 = bVar4;
                                                                        i37 = i25;
                                                                        i38 = i27;
                                                                        bVar10 = bVar8;
                                                                        jVar9 = jVar;
                                                                        right3 = (dx.i) objH;
                                                                        params7 = params4;
                                                                        if (!(right3 instanceof dx.i.Left)) {
                                                                            jVar11 = jVar9;
                                                                        } else {
                                                                            if (!(right3 instanceof dx.i.Right)) {
                                                                                throw new oq.p();
                                                                            }
                                                                            String str3 = (String) ((dx.i.Right) right3).b();
                                                                            ex.b bVar32 = bVar10;
                                                                            v24.b bVar33 = h0Var.documentsContainerRepository;
                                                                            aVar2.f209629d = vq.j.a(params7);
                                                                            aVar2.f209630e = jVar9;
                                                                            aVar2.f209631f = vq.j.a(bVar5);
                                                                            aVar2.f209632g = vq.j.a(bVar32);
                                                                            aVar2.f209633h = bVar;
                                                                            aVar2.f209634j = vq.j.a(iVar);
                                                                            aVar2.f209635k = vq.j.a(bVar9);
                                                                            aVar2.f209636l = bVar8;
                                                                            aVar2.f209637m = vq.j.a(right3);
                                                                            aVar2.f209638n = vq.j.a(str3);
                                                                            aVar2.f209639p = i37;
                                                                            aVar2.f209640q = i38;
                                                                            aVar2.f209641r = i29;
                                                                            aVar2.f209642s = i17;
                                                                            aVar2.f209643t = i28;
                                                                            aVar2.f209644v = i36;
                                                                            aVar2.f209645w = i35;
                                                                            aVar2.f209646x = 0;
                                                                            aVar2.f209647y = 0;
                                                                            aVar2.B = 7;
                                                                            objH = bVar33.H(str3, aVar2);
                                                                            if (objH != objE) {
                                                                                bVar22 = bVar;
                                                                                jVar10 = jVar9;
                                                                                bVar23 = bVar8;
                                                                                right3 = new dx.i.Right((dx.i) objH);
                                                                                bVar8 = bVar23;
                                                                                bVar = bVar22;
                                                                                jVar11 = jVar10;
                                                                            }
                                                                        }
                                                                        left = (dx.i) bVar8.a(right3);
                                                                        r17 = jVar11;
                                                                        h0Var = this;
                                                                        r16 = r17;
                                                                        r15 = r16;
                                                                    }
                                                                } else if (fr.t.c(params3.getScopeName(), "ACTIVE_TEMPORARY_DRIVING_LICENCE")) {
                                                                    h0Var = this;
                                                                    v24.b bVar34 = h0Var.documentsContainerRepository;
                                                                    aVar2.f209629d = vq.j.a(params3);
                                                                    aVar2.f209630e = jVar;
                                                                    aVar2.f209631f = vq.j.a(bVar5);
                                                                    aVar2.f209632g = vq.j.a(bVar6);
                                                                    aVar2.f209633h = bVar;
                                                                    aVar2.f209634j = vq.j.a(left);
                                                                    aVar2.f209635k = vq.j.a(bVar4);
                                                                    aVar2.f209639p = i25;
                                                                    aVar2.f209640q = i27;
                                                                    aVar2.f209641r = i18;
                                                                    aVar2.f209642s = i17;
                                                                    aVar2.f209643t = i26;
                                                                    aVar2.f209644v = 0;
                                                                    aVar2.f209645w = 0;
                                                                    aVar2.B = 8;
                                                                    objH = bVar34.H("INVALIDATED_TEMPORARY_DRIVING_LICENCE", aVar2);
                                                                    if (objH != objE) {
                                                                        bVar7 = bVar;
                                                                        jVar2 = jVar;
                                                                        left = (dx.i) objH;
                                                                        bVar = bVar7;
                                                                        r16 = jVar2;
                                                                        r15 = r16;
                                                                    }
                                                                } else {
                                                                    h0Var = this;
                                                                    left = new dx.i.Left(bVar4);
                                                                    r15 = jVar;
                                                                }
                                                            }
                                                        }
                                                    } else if (!(left instanceof dx.i.Right)) {
                                                        r15 = jVar;
                                                        throw new oq.p();
                                                    }
                                                    r15 = jVar;
                                                    return new dx.i.Right(iy.a.e(h0Var.base64Coder, ((DocumentScope) bVar.a(left)).getScopeData(), null, 2, null));
                                                }
                                                return objE;
                                            case 1:
                                                int i78 = aVar2.f209643t;
                                                int i79 = aVar2.f209642s;
                                                int i85 = aVar2.f209641r;
                                                int i86 = aVar2.f209640q;
                                                int i87 = aVar2.f209639p;
                                                bVar = (ex.b) aVar2.f209633h;
                                                ex.b bVar35 = (ex.b) aVar2.f209632g;
                                                bVar2 = (ex.b) aVar2.f209631f;
                                                dx.j<dx.b> jVar12 = (dx.j) aVar2.f209630e;
                                                params2 = (g0.Params) aVar2.f209629d;
                                                try {
                                                    oq.u.b(objH);
                                                    i16 = i78;
                                                    bVar3 = bVar35;
                                                    i17 = i79;
                                                    i18 = i85;
                                                    i19 = i86;
                                                    i15 = i87;
                                                    jVar = jVar12;
                                                    left = (dx.i) objH;
                                                    if (left instanceof dx.i.Left) {
                                                        bVar4 = (dx.b) ((dx.i.Left) left).b();
                                                        if (RailwayCardContainerData.INSTANCE.a(params2.getScopeName()) != null) {
                                                            v24.b bVar210 = h0Var.documentsContainerRepository;
                                                            f24.i iVar9 = f24.i.RAILWAY_CARD;
                                                            bVar15 = bVar2;
                                                            String scopeName3 = params2.getScopeName();
                                                            params6 = params2;
                                                            aVar2.f209629d = vq.j.a(params6);
                                                            aVar2.f209630e = jVar;
                                                            aVar2.f209631f = vq.j.a(bVar15);
                                                            aVar2.f209632g = vq.j.a(bVar3);
                                                            aVar2.f209633h = bVar;
                                                            aVar2.f209634j = vq.j.a(left);
                                                            aVar2.f209635k = vq.j.a(bVar4);
                                                            aVar2.f209636l = bVar3;
                                                            aVar2.f209639p = i15;
                                                            aVar2.f209640q = i19;
                                                            aVar2.f209641r = i18;
                                                            aVar2.f209642s = i17;
                                                            aVar2.f209643t = i16;
                                                            aVar2.f209644v = 0;
                                                            aVar2.f209645w = 0;
                                                            aVar2.B = 2;
                                                            objF = bVar210.f(iVar9, scopeName3, aVar2);
                                                            if (objF == objE) {
                                                                int i710 = i16;
                                                                i59 = i15;
                                                                i65 = i710;
                                                                iVar3 = left;
                                                                objH = objF;
                                                                i66 = i17;
                                                                i67 = i18;
                                                                i68 = 0;
                                                                bVar16 = bVar3;
                                                                bVar17 = bVar;
                                                                i69 = i19;
                                                                i75 = 0;
                                                                jVar3 = jVar;
                                                                right = (dx.i) objH;
                                                                iVar4 = iVar3;
                                                                if (!(right instanceof dx.i.Left)) {
                                                                    jVar5 = jVar3;
                                                                    bVar = bVar17;
                                                                } else {
                                                                    if (!(right instanceof dx.i.Right)) {
                                                                        throw new oq.p();
                                                                    }
                                                                    String str4 = (String) ((dx.i.Right) right).b();
                                                                    ex.b bVar211 = bVar16;
                                                                    v24.b bVar212 = h0Var.documentsContainerRepository;
                                                                    aVar2.f209629d = vq.j.a(params6);
                                                                    aVar2.f209630e = jVar3;
                                                                    aVar2.f209631f = vq.j.a(bVar15);
                                                                    aVar2.f209632g = vq.j.a(bVar211);
                                                                    aVar2.f209633h = bVar17;
                                                                    aVar2.f209634j = vq.j.a(iVar4);
                                                                    aVar2.f209635k = vq.j.a(bVar4);
                                                                    aVar2.f209636l = bVar3;
                                                                    aVar2.f209637m = vq.j.a(right);
                                                                    aVar2.f209638n = vq.j.a(str4);
                                                                    aVar2.f209639p = i59;
                                                                    aVar2.f209640q = i69;
                                                                    aVar2.f209641r = i67;
                                                                    aVar2.f209642s = i66;
                                                                    aVar2.f209643t = i65;
                                                                    aVar2.f209644v = i68;
                                                                    aVar2.f209645w = i75;
                                                                    aVar2.f209646x = 0;
                                                                    aVar2.f209647y = 0;
                                                                    aVar2.B = 3;
                                                                    objH = bVar212.H(str4, aVar2);
                                                                    if (objH != objE) {
                                                                        bVar18 = bVar3;
                                                                        jVar4 = jVar3;
                                                                        bVar19 = bVar17;
                                                                        right = new dx.i.Right((dx.i) objH);
                                                                        bVar = bVar19;
                                                                        bVar3 = bVar18;
                                                                        jVar5 = jVar4;
                                                                    }
                                                                }
                                                                left = (dx.i) bVar3.a(right);
                                                                h0Var = this;
                                                                r15 = jVar5;
                                                            }
                                                        } else {
                                                            bVar5 = bVar2;
                                                            params3 = params2;
                                                            if (fr.t.c(params3.getScopeName(), "RAILWAY_CARD_DOCUMENT_OWNER")) {
                                                                h0Var = this;
                                                                v24.b bVar213 = h0Var.documentsContainerRepository;
                                                                f24.i iVar10 = f24.i.RAILWAY_CARD;
                                                                aVar2.f209629d = vq.j.a(params3);
                                                                aVar2.f209630e = jVar;
                                                                aVar2.f209631f = vq.j.a(bVar5);
                                                                aVar2.f209632g = vq.j.a(bVar3);
                                                                aVar2.f209633h = bVar;
                                                                aVar2.f209634j = vq.j.a(left);
                                                                aVar2.f209635k = vq.j.a(bVar4);
                                                                aVar2.f209636l = bVar3;
                                                                aVar2.f209639p = i15;
                                                                aVar2.f209640q = i19;
                                                                aVar2.f209641r = i18;
                                                                aVar2.f209642s = i17;
                                                                aVar2.f209643t = i16;
                                                                aVar2.f209644v = 0;
                                                                aVar2.f209645w = 0;
                                                                aVar2.B = 4;
                                                                i39 = i15;
                                                                bVar11 = bVar3;
                                                                i45 = i19;
                                                                i46 = i16;
                                                                objD2 = v24.b.D(bVar213, iVar10, null, aVar2, 2, null);
                                                                if (objD2 == objE) {
                                                                    bVar12 = bVar4;
                                                                    params5 = params3;
                                                                    i47 = i17;
                                                                    i48 = i18;
                                                                    i49 = i46;
                                                                    i55 = 0;
                                                                    bVar13 = bVar;
                                                                    i56 = i45;
                                                                    i57 = i39;
                                                                    bVar14 = bVar11;
                                                                    iVar2 = left;
                                                                    objH = objD2;
                                                                    i58 = 0;
                                                                    jVar6 = jVar;
                                                                    right2 = (dx.i) objH;
                                                                    iVar5 = iVar2;
                                                                    if (!(right2 instanceof dx.i.Left)) {
                                                                        jVar8 = jVar6;
                                                                        bVar = bVar13;
                                                                    } else {
                                                                        if (!(right2 instanceof dx.i.Right)) {
                                                                            throw new oq.p();
                                                                        }
                                                                        String str5 = (String) ((dx.i.Right) right2).b();
                                                                        ex.b bVar214 = bVar14;
                                                                        v24.b bVar36 = h0Var.documentsContainerRepository;
                                                                        aVar2.f209629d = vq.j.a(params5);
                                                                        aVar2.f209630e = jVar6;
                                                                        aVar2.f209631f = vq.j.a(bVar5);
                                                                        aVar2.f209632g = vq.j.a(bVar214);
                                                                        aVar2.f209633h = bVar13;
                                                                        aVar2.f209634j = vq.j.a(iVar5);
                                                                        aVar2.f209635k = vq.j.a(bVar12);
                                                                        aVar2.f209636l = bVar11;
                                                                        aVar2.f209637m = vq.j.a(right2);
                                                                        aVar2.f209638n = vq.j.a(str5);
                                                                        aVar2.f209639p = i57;
                                                                        aVar2.f209640q = i56;
                                                                        aVar2.f209641r = i48;
                                                                        aVar2.f209642s = i47;
                                                                        aVar2.f209643t = i49;
                                                                        aVar2.f209644v = i58;
                                                                        aVar2.f209645w = i55;
                                                                        aVar2.f209646x = 0;
                                                                        aVar2.f209647y = 0;
                                                                        aVar2.B = 5;
                                                                        objH = bVar36.H(str5, aVar2);
                                                                        if (objH != objE) {
                                                                            jVar7 = jVar6;
                                                                            bVar20 = bVar11;
                                                                            bVar21 = bVar13;
                                                                            right2 = new dx.i.Right((dx.i) objH);
                                                                            bVar11 = bVar20;
                                                                            bVar = bVar21;
                                                                            jVar8 = jVar7;
                                                                        }
                                                                    }
                                                                    left = (dx.i) bVar11.a(right2);
                                                                    r17 = jVar8;
                                                                    h0Var = this;
                                                                    r16 = r17;
                                                                    r15 = r16;
                                                                }
                                                            } else {
                                                                bVar6 = bVar3;
                                                                i25 = i15;
                                                                i26 = i16;
                                                                i27 = i19;
                                                                if (fr.t.c(params3.getScopeName(), "FAMILY_CARD_DOCUMENT_OWNER")) {
                                                                    h0Var = this;
                                                                    v24.b bVar37 = h0Var.documentsContainerRepository;
                                                                    f24.i iVar11 = f24.i.FAMILY_CARD;
                                                                    aVar2.f209629d = vq.j.a(params3);
                                                                    aVar2.f209630e = jVar;
                                                                    aVar2.f209631f = vq.j.a(bVar5);
                                                                    aVar2.f209632g = vq.j.a(bVar6);
                                                                    aVar2.f209633h = bVar;
                                                                    aVar2.f209634j = vq.j.a(left);
                                                                    aVar2.f209635k = vq.j.a(bVar4);
                                                                    aVar2.f209636l = bVar6;
                                                                    aVar2.f209639p = i25;
                                                                    aVar2.f209640q = i27;
                                                                    aVar2.f209641r = i18;
                                                                    aVar2.f209642s = i17;
                                                                    aVar2.f209643t = i26;
                                                                    aVar2.f209644v = 0;
                                                                    aVar2.f209645w = 0;
                                                                    aVar2.B = 6;
                                                                    objD = v24.b.D(bVar37, iVar11, null, aVar2, 2, null);
                                                                    if (objD == objE) {
                                                                        iVar = left;
                                                                        objH = objD;
                                                                        i28 = i26;
                                                                        i29 = i18;
                                                                        params4 = params3;
                                                                        bVar8 = bVar6;
                                                                        i35 = 0;
                                                                        i36 = 0;
                                                                        bVar9 = bVar4;
                                                                        i37 = i25;
                                                                        i38 = i27;
                                                                        bVar10 = bVar8;
                                                                        jVar9 = jVar;
                                                                        right3 = (dx.i) objH;
                                                                        params7 = params4;
                                                                        if (!(right3 instanceof dx.i.Left)) {
                                                                            jVar11 = jVar9;
                                                                        } else {
                                                                            if (!(right3 instanceof dx.i.Right)) {
                                                                                throw new oq.p();
                                                                            }
                                                                            String str6 = (String) ((dx.i.Right) right3).b();
                                                                            ex.b bVar38 = bVar10;
                                                                            v24.b bVar39 = h0Var.documentsContainerRepository;
                                                                            aVar2.f209629d = vq.j.a(params7);
                                                                            aVar2.f209630e = jVar9;
                                                                            aVar2.f209631f = vq.j.a(bVar5);
                                                                            aVar2.f209632g = vq.j.a(bVar38);
                                                                            aVar2.f209633h = bVar;
                                                                            aVar2.f209634j = vq.j.a(iVar);
                                                                            aVar2.f209635k = vq.j.a(bVar9);
                                                                            aVar2.f209636l = bVar8;
                                                                            aVar2.f209637m = vq.j.a(right3);
                                                                            aVar2.f209638n = vq.j.a(str6);
                                                                            aVar2.f209639p = i37;
                                                                            aVar2.f209640q = i38;
                                                                            aVar2.f209641r = i29;
                                                                            aVar2.f209642s = i17;
                                                                            aVar2.f209643t = i28;
                                                                            aVar2.f209644v = i36;
                                                                            aVar2.f209645w = i35;
                                                                            aVar2.f209646x = 0;
                                                                            aVar2.f209647y = 0;
                                                                            aVar2.B = 7;
                                                                            objH = bVar39.H(str6, aVar2);
                                                                            if (objH != objE) {
                                                                                bVar22 = bVar;
                                                                                jVar10 = jVar9;
                                                                                bVar23 = bVar8;
                                                                                right3 = new dx.i.Right((dx.i) objH);
                                                                                bVar8 = bVar23;
                                                                                bVar = bVar22;
                                                                                jVar11 = jVar10;
                                                                            }
                                                                        }
                                                                        left = (dx.i) bVar8.a(right3);
                                                                        r17 = jVar11;
                                                                        h0Var = this;
                                                                        r16 = r17;
                                                                        r15 = r16;
                                                                    }
                                                                } else if (fr.t.c(params3.getScopeName(), "ACTIVE_TEMPORARY_DRIVING_LICENCE")) {
                                                                    h0Var = this;
                                                                    v24.b bVar310 = h0Var.documentsContainerRepository;
                                                                    aVar2.f209629d = vq.j.a(params3);
                                                                    aVar2.f209630e = jVar;
                                                                    aVar2.f209631f = vq.j.a(bVar5);
                                                                    aVar2.f209632g = vq.j.a(bVar6);
                                                                    aVar2.f209633h = bVar;
                                                                    aVar2.f209634j = vq.j.a(left);
                                                                    aVar2.f209635k = vq.j.a(bVar4);
                                                                    aVar2.f209639p = i25;
                                                                    aVar2.f209640q = i27;
                                                                    aVar2.f209641r = i18;
                                                                    aVar2.f209642s = i17;
                                                                    aVar2.f209643t = i26;
                                                                    aVar2.f209644v = 0;
                                                                    aVar2.f209645w = 0;
                                                                    aVar2.B = 8;
                                                                    objH = bVar310.H("INVALIDATED_TEMPORARY_DRIVING_LICENCE", aVar2);
                                                                    if (objH != objE) {
                                                                        bVar7 = bVar;
                                                                        jVar2 = jVar;
                                                                        left = (dx.i) objH;
                                                                        bVar = bVar7;
                                                                        r16 = jVar2;
                                                                        r15 = r16;
                                                                    }
                                                                } else {
                                                                    h0Var = this;
                                                                    left = new dx.i.Left(bVar4);
                                                                    r15 = jVar;
                                                                }
                                                            }
                                                        }
                                                        return objE;
                                                    }
                                                    if (!(left instanceof dx.i.Right)) {
                                                        r15 = jVar;
                                                        throw new oq.p();
                                                    }
                                                    r15 = jVar;
                                                    return new dx.i.Right(iy.a.e(h0Var.base64Coder, ((DocumentScope) bVar.a(left)).getScopeData(), null, 2, null));
                                                } catch (ex.c e15) {
                                                    e = e15;
                                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                                } catch (CancellationException e16) {
                                                    e = e16;
                                                    throw e;
                                                } catch (Exception e17) {
                                                    e = e17;
                                                    r17 = jVar12;
                                                    px.f fVar = px.f.f163100a;
                                                    message = e.getMessage();
                                                    if (message == null) {
                                                        message = "";
                                                    }
                                                    fVar.d(message, e, px.c.a(r17));
                                                    iVarA = r17.a(e);
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
                                            case 2:
                                                int i88 = aVar2.f209645w;
                                                int i89 = aVar2.f209644v;
                                                i65 = aVar2.f209643t;
                                                i66 = aVar2.f209642s;
                                                i67 = aVar2.f209641r;
                                                i69 = aVar2.f209640q;
                                                i59 = aVar2.f209639p;
                                                ex.b bVar40 = (ex.b) aVar2.f209636l;
                                                dx.b bVar41 = (dx.b) aVar2.f209635k;
                                                iVar3 = (dx.i) aVar2.f209634j;
                                                bVar17 = (ex.b) aVar2.f209633h;
                                                bVar16 = (ex.b) aVar2.f209632g;
                                                ex.b bVar42 = (ex.b) aVar2.f209631f;
                                                dx.j<dx.b> jVar13 = (dx.j) aVar2.f209630e;
                                                g0.Params params8 = (g0.Params) aVar2.f209629d;
                                                oq.u.b(objH);
                                                bVar15 = bVar42;
                                                bVar4 = bVar41;
                                                jVar3 = jVar13;
                                                params6 = params8;
                                                bVar3 = bVar40;
                                                i68 = i89;
                                                i75 = i88;
                                                right = (dx.i) objH;
                                                iVar4 = iVar3;
                                                if (!(right instanceof dx.i.Left)) {
                                                    if (!(right instanceof dx.i.Right)) {
                                                        throw new oq.p();
                                                    }
                                                    String str7 = (String) ((dx.i.Right) right).b();
                                                    ex.b bVar215 = bVar16;
                                                    v24.b bVar216 = h0Var.documentsContainerRepository;
                                                    aVar2.f209629d = vq.j.a(params6);
                                                    aVar2.f209630e = jVar3;
                                                    aVar2.f209631f = vq.j.a(bVar15);
                                                    aVar2.f209632g = vq.j.a(bVar215);
                                                    aVar2.f209633h = bVar17;
                                                    aVar2.f209634j = vq.j.a(iVar4);
                                                    aVar2.f209635k = vq.j.a(bVar4);
                                                    aVar2.f209636l = bVar3;
                                                    aVar2.f209637m = vq.j.a(right);
                                                    aVar2.f209638n = vq.j.a(str7);
                                                    aVar2.f209639p = i59;
                                                    aVar2.f209640q = i69;
                                                    aVar2.f209641r = i67;
                                                    aVar2.f209642s = i66;
                                                    aVar2.f209643t = i65;
                                                    aVar2.f209644v = i68;
                                                    aVar2.f209645w = i75;
                                                    aVar2.f209646x = 0;
                                                    aVar2.f209647y = 0;
                                                    aVar2.B = 3;
                                                    objH = bVar216.H(str7, aVar2);
                                                    if (objH != objE) {
                                                        bVar18 = bVar3;
                                                        jVar4 = jVar3;
                                                        bVar19 = bVar17;
                                                        right = new dx.i.Right((dx.i) objH);
                                                        bVar = bVar19;
                                                        bVar3 = bVar18;
                                                        jVar5 = jVar4;
                                                    }
                                                    return objE;
                                                }
                                                jVar5 = jVar3;
                                                bVar = bVar17;
                                                left = (dx.i) bVar3.a(right);
                                                h0Var = this;
                                                r15 = jVar5;
                                                r15 = jVar;
                                                return new dx.i.Right(iy.a.e(h0Var.base64Coder, ((DocumentScope) bVar.a(left)).getScopeData(), null, 2, null));
                                            case 3:
                                                bVar18 = (ex.b) aVar2.f209636l;
                                                bVar19 = (ex.b) aVar2.f209633h;
                                                dx.j<dx.b> jVar14 = (dx.j) aVar2.f209630e;
                                                oq.u.b(objH);
                                                jVar4 = jVar14;
                                                right = new dx.i.Right((dx.i) objH);
                                                bVar = bVar19;
                                                bVar3 = bVar18;
                                                jVar5 = jVar4;
                                                left = (dx.i) bVar3.a(right);
                                                h0Var = this;
                                                r15 = jVar5;
                                                r15 = jVar;
                                                return new dx.i.Right(iy.a.e(h0Var.base64Coder, ((DocumentScope) bVar.a(left)).getScopeData(), null, 2, null));
                                            case 4:
                                                int i95 = aVar2.f209645w;
                                                int i96 = aVar2.f209644v;
                                                i49 = aVar2.f209643t;
                                                i47 = aVar2.f209642s;
                                                i48 = aVar2.f209641r;
                                                i56 = aVar2.f209640q;
                                                i57 = aVar2.f209639p;
                                                ex.b bVar43 = (ex.b) aVar2.f209636l;
                                                dx.b bVar44 = (dx.b) aVar2.f209635k;
                                                dx.i iVar12 = (dx.i) aVar2.f209634j;
                                                bVar13 = (ex.b) aVar2.f209633h;
                                                bVar14 = (ex.b) aVar2.f209632g;
                                                ex.b bVar45 = (ex.b) aVar2.f209631f;
                                                dx.j<dx.b> jVar15 = (dx.j) aVar2.f209630e;
                                                g0.Params params9 = (g0.Params) aVar2.f209629d;
                                                oq.u.b(objH);
                                                bVar5 = bVar45;
                                                params5 = params9;
                                                i58 = i96;
                                                i55 = i95;
                                                bVar11 = bVar43;
                                                iVar2 = iVar12;
                                                bVar12 = bVar44;
                                                jVar6 = jVar15;
                                                right2 = (dx.i) objH;
                                                iVar5 = iVar2;
                                                if (!(right2 instanceof dx.i.Left)) {
                                                    if (!(right2 instanceof dx.i.Right)) {
                                                        throw new oq.p();
                                                    }
                                                    String str8 = (String) ((dx.i.Right) right2).b();
                                                    ex.b bVar217 = bVar14;
                                                    v24.b bVar311 = h0Var.documentsContainerRepository;
                                                    aVar2.f209629d = vq.j.a(params5);
                                                    aVar2.f209630e = jVar6;
                                                    aVar2.f209631f = vq.j.a(bVar5);
                                                    aVar2.f209632g = vq.j.a(bVar217);
                                                    aVar2.f209633h = bVar13;
                                                    aVar2.f209634j = vq.j.a(iVar5);
                                                    aVar2.f209635k = vq.j.a(bVar12);
                                                    aVar2.f209636l = bVar11;
                                                    aVar2.f209637m = vq.j.a(right2);
                                                    aVar2.f209638n = vq.j.a(str8);
                                                    aVar2.f209639p = i57;
                                                    aVar2.f209640q = i56;
                                                    aVar2.f209641r = i48;
                                                    aVar2.f209642s = i47;
                                                    aVar2.f209643t = i49;
                                                    aVar2.f209644v = i58;
                                                    aVar2.f209645w = i55;
                                                    aVar2.f209646x = 0;
                                                    aVar2.f209647y = 0;
                                                    aVar2.B = 5;
                                                    objH = bVar311.H(str8, aVar2);
                                                    if (objH != objE) {
                                                        jVar7 = jVar6;
                                                        bVar20 = bVar11;
                                                        bVar21 = bVar13;
                                                        right2 = new dx.i.Right((dx.i) objH);
                                                        bVar11 = bVar20;
                                                        bVar = bVar21;
                                                        jVar8 = jVar7;
                                                    }
                                                    return objE;
                                                }
                                                jVar8 = jVar6;
                                                bVar = bVar13;
                                                left = (dx.i) bVar11.a(right2);
                                                r17 = jVar8;
                                                h0Var = this;
                                                r16 = r17;
                                                r15 = r16;
                                                r15 = jVar;
                                                return new dx.i.Right(iy.a.e(h0Var.base64Coder, ((DocumentScope) bVar.a(left)).getScopeData(), null, 2, null));
                                            case 5:
                                                bVar20 = (ex.b) aVar2.f209636l;
                                                bVar21 = (ex.b) aVar2.f209633h;
                                                dx.j<dx.b> jVar16 = (dx.j) aVar2.f209630e;
                                                oq.u.b(objH);
                                                jVar7 = jVar16;
                                                right2 = new dx.i.Right((dx.i) objH);
                                                bVar11 = bVar20;
                                                bVar = bVar21;
                                                jVar8 = jVar7;
                                                left = (dx.i) bVar11.a(right2);
                                                r17 = jVar8;
                                                h0Var = this;
                                                r16 = r17;
                                                r15 = r16;
                                                r15 = jVar;
                                                return new dx.i.Right(iy.a.e(h0Var.base64Coder, ((DocumentScope) bVar.a(left)).getScopeData(), null, 2, null));
                                            case 6:
                                                int i97 = aVar2.f209645w;
                                                int i98 = aVar2.f209644v;
                                                int i99 = aVar2.f209643t;
                                                int i100 = aVar2.f209642s;
                                                i29 = aVar2.f209641r;
                                                i38 = aVar2.f209640q;
                                                int i101 = aVar2.f209639p;
                                                bVar8 = (ex.b) aVar2.f209636l;
                                                dx.b bVar46 = (dx.b) aVar2.f209635k;
                                                dx.i iVar13 = (dx.i) aVar2.f209634j;
                                                bVar = (ex.b) aVar2.f209633h;
                                                bVar10 = (ex.b) aVar2.f209632g;
                                                bVar5 = (ex.b) aVar2.f209631f;
                                                dx.j<dx.b> jVar17 = (dx.j) aVar2.f209630e;
                                                params4 = (g0.Params) aVar2.f209629d;
                                                oq.u.b(objH);
                                                iVar = iVar13;
                                                i37 = i101;
                                                jVar9 = jVar17;
                                                bVar9 = bVar46;
                                                i17 = i100;
                                                i28 = i99;
                                                i36 = i98;
                                                i35 = i97;
                                                right3 = (dx.i) objH;
                                                params7 = params4;
                                                if (!(right3 instanceof dx.i.Left)) {
                                                    if (!(right3 instanceof dx.i.Right)) {
                                                        throw new oq.p();
                                                    }
                                                    String str9 = (String) ((dx.i.Right) right3).b();
                                                    ex.b bVar312 = bVar10;
                                                    v24.b bVar313 = h0Var.documentsContainerRepository;
                                                    aVar2.f209629d = vq.j.a(params7);
                                                    aVar2.f209630e = jVar9;
                                                    aVar2.f209631f = vq.j.a(bVar5);
                                                    aVar2.f209632g = vq.j.a(bVar312);
                                                    aVar2.f209633h = bVar;
                                                    aVar2.f209634j = vq.j.a(iVar);
                                                    aVar2.f209635k = vq.j.a(bVar9);
                                                    aVar2.f209636l = bVar8;
                                                    aVar2.f209637m = vq.j.a(right3);
                                                    aVar2.f209638n = vq.j.a(str9);
                                                    aVar2.f209639p = i37;
                                                    aVar2.f209640q = i38;
                                                    aVar2.f209641r = i29;
                                                    aVar2.f209642s = i17;
                                                    aVar2.f209643t = i28;
                                                    aVar2.f209644v = i36;
                                                    aVar2.f209645w = i35;
                                                    aVar2.f209646x = 0;
                                                    aVar2.f209647y = 0;
                                                    aVar2.B = 7;
                                                    objH = bVar313.H(str9, aVar2);
                                                    if (objH != objE) {
                                                        bVar22 = bVar;
                                                        jVar10 = jVar9;
                                                        bVar23 = bVar8;
                                                        right3 = new dx.i.Right((dx.i) objH);
                                                        bVar8 = bVar23;
                                                        bVar = bVar22;
                                                        jVar11 = jVar10;
                                                    }
                                                    return objE;
                                                }
                                                jVar11 = jVar9;
                                                left = (dx.i) bVar8.a(right3);
                                                r17 = jVar11;
                                                h0Var = this;
                                                r16 = r17;
                                                r15 = r16;
                                                r15 = jVar;
                                                return new dx.i.Right(iy.a.e(h0Var.base64Coder, ((DocumentScope) bVar.a(left)).getScopeData(), null, 2, null));
                                            case 7:
                                                bVar23 = (ex.b) aVar2.f209636l;
                                                bVar22 = (ex.b) aVar2.f209633h;
                                                dx.j<dx.b> jVar18 = (dx.j) aVar2.f209630e;
                                                oq.u.b(objH);
                                                jVar10 = jVar18;
                                                right3 = new dx.i.Right((dx.i) objH);
                                                bVar8 = bVar23;
                                                bVar = bVar22;
                                                jVar11 = jVar10;
                                                left = (dx.i) bVar8.a(right3);
                                                r17 = jVar11;
                                                h0Var = this;
                                                r16 = r17;
                                                r15 = r16;
                                                r15 = jVar;
                                                return new dx.i.Right(iy.a.e(h0Var.base64Coder, ((DocumentScope) bVar.a(left)).getScopeData(), null, 2, null));
                                            case 8:
                                                bVar7 = (ex.b) aVar2.f209633h;
                                                dx.j<dx.b> jVar19 = (dx.j) aVar2.f209630e;
                                                oq.u.b(objH);
                                                jVar2 = jVar19;
                                                left = (dx.i) objH;
                                                bVar = bVar7;
                                                r16 = jVar2;
                                                r15 = r16;
                                                r15 = jVar;
                                                return new dx.i.Right(iy.a.e(h0Var.base64Coder, ((DocumentScope) bVar.a(left)).getScopeData(), null, 2, null));
                                            default:
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } catch (Exception e18) {
                                        e = e18;
                                        px.f fVar2 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar2.d(message, e, px.c.a(r17));
                                        iVarA = r17.a(e);
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
                                } catch (CancellationException e19) {
                                    throw e19;
                                }
                            } catch (ex.c e25) {
                                e = e25;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e26) {
                                throw e26;
                            }
                        } catch (ex.c e27) {
                            e = e27;
                        } catch (CancellationException e28) {
                            e = e28;
                        } catch (Exception e29) {
                            e = e29;
                        }
                    } catch (ex.c e35) {
                        e = e35;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e36) {
                        e = e36;
                        throw e;
                    } catch (Exception e37) {
                        e = e37;
                        r17 = -2147483648;
                        px.f fVar3 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar3.d(message, e, px.c.a(r17));
                        iVarA = r17.a(e);
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
                } catch (ex.c e38) {
                    e = e38;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e39) {
                    e = e39;
                    throw e;
                } catch (Exception e45) {
                    e = e45;
                    r17 = -2147483648;
                    px.f fVar4 = px.f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar4.d(message, e, px.c.a(r17));
                    iVarA = r17.a(e);
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
            } catch (ex.c e46) {
                e = e46;
                return new dx.i.Left((dx.b) ex.d.a(e));
            } catch (CancellationException e47) {
                throw e47;
            } catch (Exception e48) {
                e = e48;
                px.f fVar5 = px.f.f163100a;
                message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar5.d(message, e, px.c.a(r17));
                iVarA = r17.a(e);
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
        } catch (ex.c e49) {
            e = e49;
            return new dx.i.Left((dx.b) ex.d.a(e));
        } catch (CancellationException e55) {
            throw e55;
        } catch (Exception e56) {
            e = e56;
            r17 = obj;
            px.f fVar6 = px.f.f163100a;
            message = e.getMessage();
            if (message == null) {
                message = "";
            }
            fVar6.d(message, e, px.c.a(r17));
            iVarA = r17.a(e);
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
    }
}
