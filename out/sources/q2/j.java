package q2;

import lr.m;
import p071kotlin.Metadata;
import p2.SlotWriter;
import pq.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0007\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010$\u001a\u00020\t2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0017¢\u0006\u0004\b'\u0010(R\"\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130)8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0012\u0010*\u0012\u0004\b+\u0010\u0003R\u0016\u0010.\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0016\u00101\u001a\u00020/8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0018\u00100R\u0016\u00102\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b$\u0010-R\u001e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030)8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010-R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010-R\u0011\u0010:\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b4\u00109¨\u0006;"}, d2 = {"Lq2/j;", "Lq2/k;", "<init>", "()V", "", "currentSize", "requiredSize", "b", "(II)I", "Loq/i0;", "m", "k", "(II)V", "l", "", "f", "()Z", "g", "a", "Lq2/e;", "operation", "j", "(Lq2/e;)V", "i", "c", "other", "h", "(Lq2/j;)V", "Lm2/c;", "applier", "Lp2/o;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "d", "(Lm2/c;Lp2/o;Lo2/e;Lq2/g;)V", "", "toString", "()Ljava/lang/String;", "", "[Lq2/e;", "getOpCodes$runtime$annotations", "opCodes", "I", "opCodesSize", "", "[I", "intArgs", "intArgsSize", "", "e", "[Ljava/lang/Object;", "objectArgs", "objectArgsSize", "pushedIntMask", "()I", "size", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int opCodesSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int intArgsSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int objectArgsSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int pushedIntMask;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public e[] opCodes = new e[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int[] intArgs = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Object[] objectArgs = new Object[16];

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00072\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0018"}, d2 = {"Lq2/j$a;", "Lq2/f;", "<init>", "(Lq2/j;)V", "", "c", "()Z", "", "Landroidx/compose/runtime/composer/gapbuffer/changelist/IntParameter;", "parameter", "getInt", "(I)I", "T", "Lq2/e$t;", "a", "(I)Ljava/lang/Object;", "I", "opIdx", "b", "intIdx", "objIdx", "Lq2/e;", "()Lq2/e;", "operation", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int opIdx;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int intIdx;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int objIdx;

        public a() {
        }

        @Override // q2.f
        public <T> T a(int parameter) {
            return (T) j.this.objectArgs[this.objIdx + parameter];
        }

        public final e b() {
            return j.this.opCodes[this.opIdx];
        }

        public final boolean c() {
            if (this.opIdx >= j.this.opCodesSize) {
                return false;
            }
            e eVarB = b();
            this.intIdx += eVarB.getInts();
            this.objIdx += eVarB.getObjects();
            int i15 = this.opIdx + 1;
            this.opIdx = i15;
            return i15 < j.this.opCodesSize;
        }

        @Override // q2.f
        public int getInt(int parameter) {
            return j.this.intArgs[this.intIdx + parameter];
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJE\u0010\u0012\u001a\u00020\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0012\u0010\u0013Ja\u0010\u0017\u001a\u00020\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0011\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u0002¢\u0006\u0004\b\u0017\u0010\u0018J}\u0010\u001c\u001a\u00020\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u0014\"\u0004\b\u0003\u0010\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0011\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00030\u00072\u0006\u0010\u001b\u001a\u00028\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001e"}, d2 = {"Lq2/j$b;", "", "Lq2/j;", "stack", "a", "(Lq2/j;)Lq2/j;", "T", "Lq2/e$t;", "parameter", "value", "Loq/i0;", "b", "(Lq2/j;ILjava/lang/Object;)V", "U", "parameter1", "value1", "parameter2", "value2", "c", "(Lq2/j;ILjava/lang/Object;ILjava/lang/Object;)V", "V", "parameter3", "value3", "d", "(Lq2/j;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "W", "parameter4", "value4", "e", "(Lq2/j;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public static j a(j jVar) {
            return jVar;
        }

        public static final <T> void b(j jVar, int i15, T t15) {
            jVar.objectArgs[(jVar.objectArgsSize - jVar.opCodes[jVar.opCodesSize - 1].getObjects()) + i15] = t15;
        }

        public static final <T, U> void c(j jVar, int i15, T t15, int i16, U u15) {
            int objects = jVar.objectArgsSize - jVar.opCodes[jVar.opCodesSize - 1].getObjects();
            Object[] objArr = jVar.objectArgs;
            objArr[i15 + objects] = t15;
            objArr[objects + i16] = u15;
        }

        public static final <T, U, V> void d(j jVar, int i15, T t15, int i16, U u15, int i17, V v15) {
            int objects = jVar.objectArgsSize - jVar.opCodes[jVar.opCodesSize - 1].getObjects();
            Object[] objArr = jVar.objectArgs;
            objArr[i15 + objects] = t15;
            objArr[i16 + objects] = u15;
            objArr[objects + i17] = v15;
        }

        public static final <T, U, V, W> void e(j jVar, int i15, T t15, int i16, U u15, int i17, V v15, int i18, W w15) {
            int objects = jVar.objectArgsSize - jVar.opCodes[jVar.opCodesSize - 1].getObjects();
            Object[] objArr = jVar.objectArgs;
            objArr[i15 + objects] = t15;
            objArr[i16 + objects] = u15;
            objArr[i17 + objects] = v15;
            objArr[objects + i18] = w15;
        }
    }

    private final int b(int currentSize, int requiredSize) {
        return m.e(currentSize + m.j(currentSize, 1024), requiredSize);
    }

    private final void k(int currentSize, int requiredSize) {
        int[] iArr = new int[b(currentSize, requiredSize)];
        n.l(this.intArgs, iArr, 0, 0, currentSize);
        this.intArgs = iArr;
    }

    private final void l(int currentSize, int requiredSize) {
        Object[] objArr = new Object[b(currentSize, requiredSize)];
        System.arraycopy(this.objectArgs, 0, objArr, 0, currentSize);
        this.objectArgs = objArr;
    }

    private final void m() {
        int iJ = m.j(this.opCodesSize, 1024);
        int i15 = this.opCodesSize;
        e[] eVarArr = new e[iJ + i15];
        System.arraycopy(this.opCodes, 0, eVarArr, 0, i15);
        this.opCodes = eVarArr;
    }

    public final void a() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        n.z(this.objectArgs, null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    public final void c(e operation) {
        int i15 = this.pushedIntMask;
        int ints = operation.getInts();
        if (i15 == ((ints == 0 ? 0 : -1) >>> (32 - ints))) {
            operation.getObjects();
        }
    }

    public final void d(p076m2.c<?> applier, SlotWriter slots, o2.e rememberManager, g errorContext) {
        if (g()) {
            a aVar = new a();
            while (true) {
                p076m2.c<?> cVar = applier;
                SlotWriter slotWriter = slots;
                o2.e eVar = rememberManager;
                g gVar = errorContext;
                aVar.b().b(aVar, cVar, slotWriter, eVar, gVar);
                if (!aVar.c()) {
                    break;
                }
                applier = cVar;
                slots = slotWriter;
                rememberManager = eVar;
                errorContext = gVar;
            }
        }
        a();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getOpCodesSize() {
        return this.opCodesSize;
    }

    public final boolean f() {
        return getOpCodesSize() == 0;
    }

    public final boolean g() {
        return getOpCodesSize() != 0;
    }

    public final void h(j other) {
        e[] eVarArr = this.opCodes;
        int i15 = this.opCodesSize - 1;
        this.opCodesSize = i15;
        e eVar = eVarArr[i15];
        eVarArr[i15] = null;
        other.j(eVar);
        Object[] objArr = this.objectArgs;
        Object[] objArr2 = other.objectArgs;
        int objects = other.objectArgsSize - eVar.getObjects();
        int objects2 = this.objectArgsSize - eVar.getObjects();
        System.arraycopy(objArr, objects2, objArr2, objects, this.objectArgsSize - objects2);
        n.z(this.objectArgs, null, this.objectArgsSize - eVar.getObjects(), this.objectArgsSize);
        n.l(this.intArgs, other.intArgs, other.intArgsSize - eVar.getInts(), this.intArgsSize - eVar.getInts(), this.intArgsSize);
        this.objectArgsSize -= eVar.getObjects();
        this.intArgsSize -= eVar.getInts();
    }

    public final void i(e operation) {
        j(operation);
    }

    public final void j(e operation) {
        if (this.opCodesSize == this.opCodes.length) {
            m();
        }
        int ints = this.intArgsSize + operation.getInts();
        int length = this.intArgs.length;
        if (ints > length) {
            k(length, ints);
        }
        int objects = this.objectArgsSize + operation.getObjects();
        int length2 = this.objectArgs.length;
        if (objects > length2) {
            l(length2, objects);
        }
        e[] eVarArr = this.opCodes;
        int i15 = this.opCodesSize;
        this.opCodesSize = i15 + 1;
        eVarArr[i15] = operation;
        this.intArgsSize += operation.getInts();
        this.objectArgsSize += operation.getObjects();
    }

    @oq.a
    public String toString() {
        return super.toString();
    }
}
