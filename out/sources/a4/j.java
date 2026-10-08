package a4;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.hpke.HPKE;
import p071kotlin.Metadata;
import x3.IndirectPointerInputChange;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\tJ9\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010)R \u00100\u001a\u00020+8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010,\u0012\u0004\b/\u0010\u0003\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u001b048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00109R\u0016\u0010<\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010;R\u0016\u0010=\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010;R\u0016\u0010?\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010>R\u0016\u0010@\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010A¨\u0006C"}, d2 = {"La4/j;", "", "<init>", "()V", "Loq/i0;", "j", "Landroid/view/MotionEvent;", "motionEvent", "a", "(Landroid/view/MotionEvent;)V", "i", "", "pointerId", "", "h", "(Landroid/view/MotionEvent;I)Z", "motionEventPointerId", "La4/a0;", "g", "(I)J", "b", "La4/q0;", "positionCalculator", "Lm3/e;", "rawPositionOverride", "index", "pressed", "La4/e0;", "e", "(La4/q0;Landroid/view/MotionEvent;Lm3/e;IZ)La4/e0;", "La4/d0;", "d", "(Landroid/view/MotionEvent;La4/q0;)La4/d0;", "Lx3/d;", "primaryDirectionalMotionAxisOverride", "Lx3/a;", "c", "(Landroid/view/MotionEvent;Lx3/d;)Lx3/a;", "f", "(I)V", "", "J", "nextId", "Landroid/util/SparseLongArray;", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui", "()Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui$annotations", "motionEventToComposePointerIdMap", "Landroid/util/SparseBooleanArray;", "Landroid/util/SparseBooleanArray;", "activeHoverIds", "", "Ljava/util/List;", "pointers", "Lr0/a0;", "La4/j$a;", "Lr0/a0;", "previousIndirectPointerEventData", "I", "previousToolType", "previousSource", "Z", "isInFakeFingerGesture", "isReinterpretingFakeFingerGesture", "Lm3/e;", "inferredCursorRawOffset", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long nextId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SparseBooleanArray activeHoverIds = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<PointerInputEventData> pointers = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final r0.a0<a> previousIndirectPointerEventData = new r0.a0<>(0, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int previousToolType = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int previousSource = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isInFakeFingerGesture;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isReinterpretingFakeFingerGesture;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private m3.e inferredCursorRawOffset;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0083@\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0016B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\f\u0088\u0001\n\u0092\u0001\u00020\u0002¨\u0006\u001e"}, d2 = {"La4/j$a;", "", "", "uptime", "Lm3/e;", "position", "", "down", "c", "(JJZ)J", "packedValue", "b", "(J)J", "", "i", "(J)Ljava/lang/String;", "", "h", "(J)I", "other", "d", "(JLjava/lang/Object;)Z", "a", "J", "getPackedValue", "()J", "e", "(J)Z", "g", "f", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long packedValue;

        /* JADX INFO: renamed from: a4.j$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"La4/j$a$a;", "", "<init>", "()V", "", "val1", "val2", "", "d", "(SS)I", "value", "e", "(I)S", "f", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int d(short val1, short val2) {
                return (val1 << 16) | (val2 & HPKE.aead_EXPORT_ONLY);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final short e(int value) {
                return (short) (value >>> 16);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final short f(int value) {
                return (short) (value & 65535);
            }

            private Companion() {
            }
        }

        private /* synthetic */ a(long j15) {
            this.packedValue = j15;
        }

        public static final /* synthetic */ a a(long j15) {
            return new a(j15);
        }

        public static long b(long j15) {
            return j15;
        }

        public static long c(long j15, long j16, boolean z15) {
            return b(((j15 & 2147483647L) << 1) | (z15 ? 1L : 0L) | (((long) INSTANCE.d((short) Float.intBitsToFloat((int) (j16 >> 32)), (short) Float.intBitsToFloat((int) (j16 & BodyPartID.bodyIdMax)))) << 32));
        }

        public static boolean d(long j15, Object obj) {
            return (obj instanceof a) && j15 == ((a) obj).getPackedValue();
        }

        public static final boolean e(long j15) {
            return (j15 & 1) != 0;
        }

        public static final long f(long j15) {
            int i15 = (int) (j15 >>> 32);
            Companion companion = INSTANCE;
            float fE = companion.e(i15);
            return m3.e.e((((long) Float.floatToRawIntBits(companion.f(i15))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fE) << 32));
        }

        public static final long g(long j15) {
            return (j15 >> 1) & 2147483647L;
        }

        public static int h(long j15) {
            return Long.hashCode(j15);
        }

        public static String i(long j15) {
            return "IndirectPointerEventData(packedValue=" + j15 + ')';
        }

        public boolean equals(Object obj) {
            return d(this.packedValue, obj);
        }

        public int hashCode() {
            return h(this.packedValue);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final /* synthetic */ long getPackedValue() {
            return this.packedValue;
        }

        public String toString() {
            return i(this.packedValue);
        }
    }

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                long j15 = this.nextId;
                this.nextId = 1 + j15;
                sparseLongArray.put(pointerId, j15);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j16 = this.nextId;
            this.nextId = 1 + j16;
            sparseLongArray2.put(pointerId2, j16);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.activeHoverIds.put(pointerId2, true);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.previousToolType && source == this.previousSource) {
            return;
        }
        this.previousToolType = toolType;
        this.previousSource = source;
        this.activeHoverIds.clear();
        this.motionEventToComposePointerIdMap.clear();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0091  */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:23:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:48:0x010d  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x01de  */
    /* JADX WARN: Code duplicated, block: B:78:0x0207  */
    /* JADX WARN: Code duplicated, block: B:80:0x020b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0242  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b1 A[EDGE_INSN: B:91:0x01b1->B:66:0x01b1 BREAK  A[LOOP:0: B:46:0x0105->B:65:0x01ab], SYNTHETIC] */
    private final PointerInputEventData e(q0 positionCalculator, MotionEvent motionEvent, m3.e rawPositionOverride, int index, boolean pressed) {
        char c15;
        long j15;
        long jK;
        long j16;
        long jH;
        int toolType;
        char c16;
        int iE;
        int historySize;
        int i15;
        float fFloatValue;
        long jC;
        long jC2;
        Float f15;
        float historicalX;
        long jG = g(motionEvent.getPointerId(index));
        float pressure = motionEvent.getPressure(index);
        long jE = m3.e.e((((long) Float.floatToRawIntBits(motionEvent.getY(index))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(motionEvent.getX(index))) << 32));
        if (index != 0) {
            c15 = ' ';
            j15 = 4294967295L;
            if (Build.VERSION.SDK_INT >= 29) {
                jK = rawPositionOverride != null ? rawPositionOverride.getPackedValue() : k.f2683a.a(motionEvent, index);
                jH = positionCalculator.h(jK);
            } else {
                jK = positionCalculator.k(jE);
                j16 = jE;
            }
            long j17 = jK;
            toolType = motionEvent.getToolType(index);
            if (toolType != 0) {
                c16 = c15;
                if (toolType != 1) {
                    if (toolType != 2) {
                        iE = p0.INSTANCE.c();
                    } else if (toolType != 3) {
                        iE = p0.INSTANCE.b();
                    } else if (toolType != 4) {
                        iE = p0.INSTANCE.e();
                    } else {
                        iE = p0.INSTANCE.a();
                    }
                } else if (!f3.h.isTrackpadGestureHandlingEnabled) {
                    iE = ((!motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584)) && (!this.isInFakeFingerGesture || this.isReinterpretingFakeFingerGesture)) ? p0.INSTANCE.b() : p0.INSTANCE.d();
                } else {
                    iE = p0.INSTANCE.d();
                }
            } else {
                c16 = c15;
                iE = p0.INSTANCE.e();
            }
            ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            int i16 = iE;
            i15 = 0;
            while (true) {
                fFloatValue = 1.0f;
                if (i15 < historySize) {
                    break;
                }
                historicalX = motionEvent.getHistoricalX(index, i15);
                float historicalY = motionEvent.getHistoricalY(index, i15);
                long j18 = jE;
                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                    long jE2 = m3.e.e((((long) Float.floatToRawIntBits(historicalX)) << c16) | (((long) Float.floatToRawIntBits(historicalY)) & j15));
                    long historicalEventTime = motionEvent.getHistoricalEventTime(i15);
                    Float fValueOf = Float.valueOf(motionEvent.getHistoricalAxisValue(52, index, i15));
                    f15 = fValueOf.floatValue() > 0.0f ? fValueOf : null;
                    arrayList.add(new HistoricalChange(historicalEventTime, jE2, f15 != null ? f15.floatValue() : 1.0f, (Build.VERSION.SDK_INT < 29 || motionEvent.getClassification() != 3) ? m3.e.INSTANCE.c() : m3.e.e((((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, index, i15))) << c16) | (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, index, i15))) & j15)), jE2, null));
                }
                i15++;
                jE = j18;
            }
            long j19 = jE;
            if (motionEvent.getActionMasked() == 8) {
                jC = m3.e.e((((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j15) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c16));
            } else {
                jC = m3.e.INSTANCE.c();
            }
            if (f3.h.isTrackpadGestureHandlingEnabled && Build.VERSION.SDK_INT >= 29 && motionEvent.getClassification() == 5) {
                Float fValueOf2 = Float.valueOf(motionEvent.getAxisValue(52, index));
                f15 = fValueOf2.floatValue() > 0.0f ? fValueOf2 : null;
                if (f15 != null) {
                    fFloatValue = f15.floatValue();
                }
            }
            if (f3.h.isTrackpadGestureHandlingEnabled || Build.VERSION.SDK_INT < 29 || motionEvent.getClassification() != 3) {
                jC2 = m3.e.INSTANCE.c();
            } else {
                jC2 = m3.e.e((((long) Float.floatToRawIntBits(motionEvent.getAxisValue(50, index))) << c16) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(51, index))) & j15));
            }
            return new PointerInputEventData(jG, motionEvent.getEventTime(), j17, j16, pressed, pressure, i16, this.activeHoverIds.get(motionEvent.getPointerId(index), false), arrayList, jC, fFloatValue, jC2, j19, null);
        }
        if (rawPositionOverride != null) {
            c15 = ' ';
            jK = rawPositionOverride.getPackedValue();
            j15 = 4294967295L;
        } else {
            c15 = ' ';
            j15 = 4294967295L;
            jK = m3.e.e((((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY())) & BodyPartID.bodyIdMax));
        }
        jH = positionCalculator.h(jK);
        j16 = jH;
        long j110 = jK;
        toolType = motionEvent.getToolType(index);
        if (toolType != 0) {
            c16 = c15;
            if (toolType != 1) {
                if (toolType != 2) {
                    iE = p0.INSTANCE.c();
                } else if (toolType != 3) {
                    iE = p0.INSTANCE.b();
                } else if (toolType != 4) {
                    iE = p0.INSTANCE.e();
                } else {
                    iE = p0.INSTANCE.a();
                }
            } else if (!f3.h.isTrackpadGestureHandlingEnabled) {
                iE = p0.INSTANCE.d();
            } else if (motionEvent.isFromSource(8194)) {
            }
        } else {
            c16 = c15;
            iE = p0.INSTANCE.e();
        }
        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        int i17 = iE;
        i15 = 0;
        while (true) {
            fFloatValue = 1.0f;
            if (i15 < historySize) {
                break;
                break;
            }
            historicalX = motionEvent.getHistoricalX(index, i15);
            float historicalY2 = motionEvent.getHistoricalY(index, i15);
            long j111 = jE;
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
            }
            i15++;
            jE = j111;
        }
        long j112 = jE;
        if (motionEvent.getActionMasked() == 8) {
            jC = m3.e.e((((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j15) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c16));
        } else {
            jC = m3.e.INSTANCE.c();
        }
        if (f3.h.isTrackpadGestureHandlingEnabled) {
            Float fValueOf3 = Float.valueOf(motionEvent.getAxisValue(52, index));
            if (fValueOf3.floatValue() > 0.0f) {
            }
            if (f15 != null) {
                fFloatValue = f15.floatValue();
            }
        }
        if (f3.h.isTrackpadGestureHandlingEnabled) {
            jC2 = m3.e.INSTANCE.c();
        } else {
            jC2 = m3.e.INSTANCE.c();
        }
        return new PointerInputEventData(jG, motionEvent.getEventTime(), j110, j16, pressed, pressure, i17, this.activeHoverIds.get(motionEvent.getPointerId(index), false), arrayList2, jC, fFloatValue, jC2, j112, null);
    }

    private final long g(int motionEventPointerId) {
        long jValueAt;
        int iIndexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(motionEventPointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = this.motionEventToComposePointerIdMap.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.nextId;
            this.nextId = 1 + jValueAt;
            this.motionEventToComposePointerIdMap.put(motionEventPointerId, jValueAt);
        }
        return a0.a(jValueAt);
    }

    private final boolean h(MotionEvent motionEvent, int i15) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i16 = 0; i16 < pointerCount; i16++) {
            if (motionEvent.getPointerId(i16) == i15) {
                return true;
            }
        }
        return false;
    }

    private final void i(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.activeHoverIds.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.activeHoverIds.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int iKeyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!h(motionEvent, iKeyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.activeHoverIds.delete(iKeyAt);
                }
            }
        }
    }

    private final void j() {
        this.isInFakeFingerGesture = false;
        this.isReinterpretingFakeFingerGesture = false;
        this.inferredCursorRawOffset = null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    public final x3.a c(MotionEvent motionEvent, x3.d primaryDirectionalMotionAxisOverride) {
        int actionIndex;
        long eventTime;
        long jF;
        boolean zE;
        int actionMasked = motionEvent.getActionMasked();
        b(motionEvent);
        if (actionMasked == 3) {
            this.motionEventToComposePointerIdMap.clear();
            this.activeHoverIds.clear();
            return null;
        }
        a(motionEvent);
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        boolean z15 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
        int pointerCount = motionEvent.getPointerCount();
        boolean z16 = false;
        ArrayList arrayList = new ArrayList(pointerCount);
        int i15 = 0;
        while (i15 < pointerCount) {
            long jG = g(motionEvent.getPointerId(i15));
            long jE = m3.e.e((((long) Float.floatToRawIntBits(motionEvent.getY(i15))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(motionEvent.getX(i15))) << 32));
            boolean z17 = i15 != actionIndex ? true : z16;
            a aVarG = this.previousIndirectPointerEventData.g(jG);
            if (i15 == actionIndex) {
                this.previousIndirectPointerEventData.o(jG);
            } else {
                if (z15) {
                    this.previousIndirectPointerEventData.m(jG, a.a(a.c(motionEvent.getEventTime(), jE, true)));
                }
                long eventTime2 = motionEvent.getEventTime();
                int i16 = i15;
                float pressure = motionEvent.getPressure(i16);
                if (aVarG != null) {
                    eventTime = a.g(aVarG.getPackedValue());
                } else {
                    eventTime = motionEvent.getEventTime();
                }
                if (aVarG != null) {
                    jF = a.f(aVarG.getPackedValue());
                } else {
                    jF = jE;
                }
                if (aVarG != null) {
                    zE = a.e(aVarG.getPackedValue());
                } else {
                    zE = false;
                }
                arrayList.add(new IndirectPointerInputChange(jG, eventTime2, jE, z17, pressure, eventTime, jF, zE, null));
                i15 = i16 + 1;
                z16 = false;
            }
            long eventTime3 = motionEvent.getEventTime();
            int i17 = i15;
            float pressure2 = motionEvent.getPressure(i17);
            if (aVarG != null) {
                eventTime = a.g(aVarG.getPackedValue());
            } else {
                eventTime = motionEvent.getEventTime();
            }
            if (aVarG != null) {
                jF = a.f(aVarG.getPackedValue());
            } else {
                jF = jE;
            }
            if (aVarG != null) {
                zE = a.e(aVarG.getPackedValue());
            } else {
                zE = false;
            }
            arrayList.add(new IndirectPointerInputChange(jG, eventTime3, jE, z17, pressure2, eventTime, jF, zE, null));
            i15 = i17 + 1;
            z16 = false;
        }
        i(motionEvent);
        return new x3.a(arrayList, x3.b.a(actionMasked), primaryDirectionalMotionAxisOverride != null ? primaryDirectionalMotionAxisOverride.getValue() : x3.b.c(motionEvent), motionEvent, null);
    }

    public final d0 d(MotionEvent motionEvent, q0 positionCalculator) {
        int actionIndex;
        j jVar;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.motionEventToComposePointerIdMap.clear();
            this.activeHoverIds.clear();
            j();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z15 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z16 = actionMasked == 8;
        if (z15) {
            this.activeHoverIds.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        this.pointers.clear();
        if (f3.h.isTrackpadGestureHandlingEnabled && motionEvent.getActionMasked() == 0) {
            boolean z17 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z18 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z17 || z18) {
                this.isInFakeFingerGesture = true;
            }
        }
        if (f3.h.isTrackpadGestureHandlingEnabled && Build.VERSION.SDK_INT >= 34 && motionEvent.getClassification() == 3) {
            this.isReinterpretingFakeFingerGesture = true;
            if (motionEvent.getActionMasked() == 0) {
                this.inferredCursorRawOffset = m3.e.d(m3.e.e((((long) Float.floatToRawIntBits(motionEvent.getRawY(0))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(motionEvent.getRawX(0))) << 32)));
            }
            motionEvent2 = motionEvent;
            jVar = this;
            this.pointers.add(e(positionCalculator, motionEvent2, this.inferredCursorRawOffset, 0, false));
        } else {
            jVar = this;
            MotionEvent motionEvent3 = motionEvent;
            q0 q0Var = positionCalculator;
            jVar.isReinterpretingFakeFingerGesture = false;
            int pointerCount = motionEvent3.getPointerCount();
            int i15 = 0;
            while (i15 < pointerCount) {
                jVar.pointers.add(jVar.e(q0Var, motionEvent3, null, i15, (z15 || i15 == actionIndex || (z16 && motionEvent3.getButtonState() == 0)) ? false : true));
                i15++;
                motionEvent3 = motionEvent3;
                q0Var = q0Var;
            }
            motionEvent2 = motionEvent3;
        }
        if (motionEvent2.getActionMasked() == 1) {
            j();
        }
        i(motionEvent2);
        return new d0(motionEvent2.getEventTime(), jVar.pointers, motionEvent2);
    }

    public final void f(int pointerId) {
        this.activeHoverIds.delete(pointerId);
        this.motionEventToComposePointerIdMap.delete(pointerId);
    }
}
