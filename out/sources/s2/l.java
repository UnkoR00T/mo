package s2;

import lr.m;
import p071kotlin.Metadata;
import pq.n;
import r2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0012*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010$\u001a\u00020\t2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0017¢\u0006\u0004\b'\u0010(R$\u0010-\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0010R\"\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130.8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0012\u0010/\u0012\u0004\b0\u0010\u0003R\u0016\u00103\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0016\u00106\u001a\u0002048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0018\u00105R\u0016\u00107\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b$\u00102R\u001e\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080.8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b,\u00109R\u0016\u0010<\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b;\u00102R\u0016\u0010=\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0011\u0010?\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b;\u0010>¨\u0006@"}, d2 = {"Ls2/l;", "Lo2/a;", "<init>", "()V", "", "currentSize", "requiredSize", "c", "(II)I", "Loq/i0;", "o", "m", "(II)V", "n", "", "h", "()Z", "i", "b", "Ls2/f;", "operation", "l", "(Ls2/f;)V", "k", "d", "other", "j", "(Ls2/l;)V", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "e", "(Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "", "toString", "()Ljava/lang/String;", "value", "a", "Z", "f", "requiresApplication", "", "[Ls2/f;", "getOpCodes$runtime$annotations", "opCodes", "I", "opCodesSize", "", "[I", "intArgs", "intArgsSize", "", "[Ljava/lang/Object;", "objectArgs", "g", "objectArgsSize", "pushedIntMask", "()I", "size", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends o2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean requiresApplication;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int opCodesSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int intArgsSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int objectArgsSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int pushedIntMask;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public f[] opCodes = new f[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int[] intArgs = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Object[] objectArgs = new Object[16];

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00072\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0018"}, d2 = {"Ls2/l$a;", "Ls2/h;", "<init>", "(Ls2/l;)V", "", "c", "()Z", "", "Landroidx/compose/runtime/composer/linkbuffer/changelist/IntParameter;", "parameter", "getInt", "(I)I", "T", "Ls2/f$s;", "a", "(I)Ljava/lang/Object;", "I", "opIdx", "b", "intIdx", "objIdx", "Ls2/f;", "()Ls2/f;", "operation", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int opIdx;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int intIdx;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int objIdx;

        public a() {
        }

        @Override // s2.h
        public <T> T a(int parameter) {
            return (T) l.this.objectArgs[this.objIdx + parameter];
        }

        public final f b() {
            return l.this.opCodes[this.opIdx];
        }

        public final boolean c() {
            if (this.opIdx >= l.this.opCodesSize) {
                return false;
            }
            f fVarB = b();
            this.intIdx += fVarB.getInts();
            this.objIdx += fVarB.getObjects();
            int i15 = this.opIdx + 1;
            this.opIdx = i15;
            return i15 < l.this.opCodesSize;
        }

        @Override // s2.h
        public int getInt(int parameter) {
            return l.this.intArgs[this.intIdx + parameter];
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\n\u0010\t\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013JE\u0010\u0019\u001a\u00020\f\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0016\u001a\u00028\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0018\u001a\u00028\u0001¢\u0006\u0004\b\u0019\u0010\u001aJa\u0010\u001e\u001a\u00020\f\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0014\"\u0004\b\u0002\u0010\u001b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0016\u001a\u00028\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0018\u001a\u00028\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u001d\u001a\u00028\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ}\u0010#\u001a\u00020\f\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0014\"\u0004\b\u0002\u0010\u001b\"\u0004\b\u0003\u0010 2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0016\u001a\u00028\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0018\u001a\u00028\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u001d\u001a\u00028\u00022\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00030\u00102\u0006\u0010\"\u001a\u00028\u0003¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\f¢\u0006\u0004\b%\u0010&\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006'"}, d2 = {"Ls2/l$b;", "", "Ls2/l;", "stack", "a", "(Ls2/l;)Ls2/l;", "", "Landroidx/compose/runtime/composer/linkbuffer/changelist/IntParameter;", "highParameter", "lowParameter", "", "value", "Loq/i0;", "c", "(Ls2/l;IIJ)V", "T", "Ls2/f$s;", "parameter", "d", "(Ls2/l;ILjava/lang/Object;)V", "U", "parameter1", "value1", "parameter2", "value2", "e", "(Ls2/l;ILjava/lang/Object;ILjava/lang/Object;)V", "V", "parameter3", "value3", "f", "(Ls2/l;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "W", "parameter4", "value4", "g", "(Ls2/l;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "b", "(Ls2/l;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public static l a(l lVar) {
            return lVar;
        }

        public static final void b(l lVar) {
            lVar.requiresApplication = true;
        }

        public static final void c(l lVar, int i15, int i16, long j15) {
            lVar.intArgs[(lVar.intArgsSize - lVar.opCodes[lVar.opCodesSize - 1].getInts()) + i15] = (int) (j15 >>> 32);
            lVar.intArgs[(lVar.intArgsSize - lVar.opCodes[lVar.opCodesSize - 1].getInts()) + i16] = (int) j15;
        }

        public static final <T> void d(l lVar, int i15, T t15) {
            lVar.objectArgs[(lVar.objectArgsSize - lVar.opCodes[lVar.opCodesSize - 1].getObjects()) + i15] = t15;
        }

        public static final <T, U> void e(l lVar, int i15, T t15, int i16, U u15) {
            int objects = lVar.objectArgsSize - lVar.opCodes[lVar.opCodesSize - 1].getObjects();
            Object[] objArr = lVar.objectArgs;
            objArr[i15 + objects] = t15;
            objArr[objects + i16] = u15;
        }

        public static final <T, U, V> void f(l lVar, int i15, T t15, int i16, U u15, int i17, V v15) {
            int objects = lVar.objectArgsSize - lVar.opCodes[lVar.opCodesSize - 1].getObjects();
            Object[] objArr = lVar.objectArgs;
            objArr[i15 + objects] = t15;
            objArr[i16 + objects] = u15;
            objArr[objects + i17] = v15;
        }

        public static final <T, U, V, W> void g(l lVar, int i15, T t15, int i16, U u15, int i17, V v15, int i18, W w15) {
            int objects = lVar.objectArgsSize - lVar.opCodes[lVar.opCodesSize - 1].getObjects();
            Object[] objArr = lVar.objectArgs;
            objArr[i15 + objects] = t15;
            objArr[i16 + objects] = u15;
            objArr[i17 + objects] = v15;
            objArr[objects + i18] = w15;
        }
    }

    private final int c(int currentSize, int requiredSize) {
        return m.e(currentSize + m.j(currentSize, 1024), requiredSize);
    }

    private final void m(int currentSize, int requiredSize) {
        int[] iArr = new int[c(currentSize, requiredSize)];
        n.l(this.intArgs, iArr, 0, 0, currentSize);
        this.intArgs = iArr;
    }

    private final void n(int currentSize, int requiredSize) {
        Object[] objArr = new Object[c(currentSize, requiredSize)];
        System.arraycopy(this.objectArgs, 0, objArr, 0, currentSize);
        this.objectArgs = objArr;
    }

    private final void o() {
        int iJ = m.j(this.opCodesSize, 1024);
        int i15 = this.opCodesSize;
        f[] fVarArr = new f[iJ + i15];
        System.arraycopy(this.opCodes, 0, fVarArr, 0, i15);
        this.opCodes = fVarArr;
    }

    public final void b() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        n.z(this.objectArgs, null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
        this.requiresApplication = false;
    }

    public final void d(f operation) {
        int i15 = this.pushedIntMask;
        int ints = operation.getInts();
        if (i15 == ((ints == 0 ? 0 : -1) >>> (32 - ints))) {
            operation.getObjects();
        }
    }

    public final void e(p076m2.c<?> applier, t slots, o2.e rememberManager, q2.g errorContext) {
        if (i()) {
            a aVar = new a();
            while (true) {
                p076m2.c<?> cVar = applier;
                t tVar = slots;
                o2.e eVar = rememberManager;
                q2.g gVar = errorContext;
                aVar.b().b(aVar, cVar, tVar, eVar, gVar);
                if (!aVar.c()) {
                    break;
                }
                applier = cVar;
                slots = tVar;
                rememberManager = eVar;
                errorContext = gVar;
            }
        }
        b();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRequiresApplication() {
        return this.requiresApplication;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getOpCodesSize() {
        return this.opCodesSize;
    }

    public final boolean h() {
        return getOpCodesSize() == 0;
    }

    public final boolean i() {
        return getOpCodesSize() != 0;
    }

    public final void j(l other) {
        f[] fVarArr = this.opCodes;
        int i15 = this.opCodesSize - 1;
        this.opCodesSize = i15;
        f fVar = fVarArr[i15];
        fVarArr[i15] = null;
        other.l(fVar);
        Object[] objArr = this.objectArgs;
        Object[] objArr2 = other.objectArgs;
        int objects = other.objectArgsSize - fVar.getObjects();
        int objects2 = this.objectArgsSize - fVar.getObjects();
        System.arraycopy(objArr, objects2, objArr2, objects, this.objectArgsSize - objects2);
        n.z(this.objectArgs, null, this.objectArgsSize - fVar.getObjects(), this.objectArgsSize);
        n.l(this.intArgs, other.intArgs, other.intArgsSize - fVar.getInts(), this.intArgsSize - fVar.getInts(), this.intArgsSize);
        this.objectArgsSize -= fVar.getObjects();
        this.intArgsSize -= fVar.getInts();
    }

    public final void k(f operation) {
        l(operation);
    }

    public final void l(f operation) {
        if (this.opCodesSize == this.opCodes.length) {
            o();
        }
        int ints = this.intArgsSize + operation.getInts();
        int length = this.intArgs.length;
        if (ints > length) {
            m(length, ints);
        }
        int objects = this.objectArgsSize + operation.getObjects();
        int length2 = this.objectArgs.length;
        if (objects > length2) {
            n(length2, objects);
        }
        f[] fVarArr = this.opCodes;
        int i15 = this.opCodesSize;
        this.opCodesSize = i15 + 1;
        fVarArr[i15] = operation;
        this.intArgsSize += operation.getInts();
        this.objectArgsSize += operation.getObjects();
        if (operation.getIsExternallyVisible()) {
            this.requiresApplication = true;
        }
    }

    @oq.a
    public String toString() {
        return super.toString();
    }
}
