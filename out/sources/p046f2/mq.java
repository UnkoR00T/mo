package p046f2;

import b3.a0;
import b3.b0;
import b3.x;
import er.l;
import er.p;
import fr.k;
import java.util.List;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.m5;
import p076m2.y2;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0012\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001f\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\"\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001cR\u0017\u0010%\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001cR$\u0010)\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0015\"\u0004\b(\u0010\u0016R$\u0010+\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0015\"\u0004\b#\u0010\u0016R$\u0010-\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010\u0015\"\u0004\b\u0019\u0010\u0016R$\u0010.\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0015\"\u0004\b \u0010\u0016¨\u0006/"}, d2 = {"Lf2/mq;", "Lf2/jq;", "", "initialHour", "initialMinute", "", "is24Hour", "<init>", "(IIZ)V", "a", "Z", "i", "()Z", "set24hour", "(Z)V", "is24hour", "Lf2/iq;", "<set-?>", "b", "Lm2/a3;", "d", "()I", "(I)V", "selection", "Lm2/y2;", "c", "Lm2/y2;", "getHourState", "()Lm2/y2;", "hourState", "getMinuteState", "minuteState", "e", "getHourInputState", "hourInputState", "f", "getMinuteInputState", "minuteInputState", "value", "h", "g", "minute", "j", "hour", "k", "hourInput", "minuteInput", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class mq implements jq {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean is24hour;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a3 selection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y2 hourState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final y2 minuteState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final y2 hourInputState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final y2 minuteInputState;

    /* JADX INFO: renamed from: f2.mq$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf2/mq$a;", "", "<init>", "()V", "Lb3/x;", "Lf2/mq;", "c", "()Lb3/x;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List d(b0 b0Var, mq mqVar) {
            return v.q(Integer.valueOf(mqVar.j()), Integer.valueOf(mqVar.h()), Boolean.valueOf(mqVar.getIs24hour()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mq e(List list) {
            return new mq(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Boolean) list.get(2)).booleanValue());
        }

        public final x<mq, ?> c() {
            return a0.e(new p() { // from class: f2.kq
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return mq.Companion.d((b0) obj, (mq) obj2);
                }
            }, new l() { // from class: f2.lq
                @Override // er.l
                public final Object b(Object obj) {
                    return mq.Companion.e((List) obj);
                }
            });
        }

        private Companion() {
        }
    }

    public mq(int i15, int i16, boolean z15) {
        if (i15 < 0 || i15 >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range");
        }
        if (i16 < 0 || i16 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range");
        }
        this.is24hour = z15;
        this.selection = c6.e(iq.c(iq.INSTANCE.a()), null, 2, null);
        this.hourState = m5.a(i15);
        this.minuteState = m5.a(i16);
        this.hourInputState = m5.a(i15);
        this.minuteInputState = m5.a(i16);
    }

    @Override // p046f2.jq
    public int a() {
        return this.minuteInputState.d();
    }

    @Override // p046f2.jq
    public void b(int i15) {
        this.selection.setValue(iq.c(i15));
    }

    @Override // p046f2.jq
    public void c(int i15) {
        super.c(i15);
        this.hourInputState.g(i15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p046f2.jq
    public int d() {
        return ((iq) this.selection.getValue()).getValue();
    }

    @Override // p046f2.jq
    public void e(int i15) {
        super.e(i15);
        this.minuteInputState.g(i15);
    }

    @Override // p046f2.jq
    public void f(int i15) {
        this.hourState.g(i15);
        this.hourInputState.g(i15);
    }

    @Override // p046f2.jq
    public void g(int i15) {
        this.minuteState.g(i15);
        this.minuteInputState.g(i15);
    }

    @Override // p046f2.jq
    public int h() {
        return this.minuteState.d();
    }

    @Override // p046f2.jq
    /* JADX INFO: renamed from: i, reason: from getter */
    public boolean getIs24hour() {
        return this.is24hour;
    }

    @Override // p046f2.jq
    public int j() {
        return this.hourState.d();
    }

    @Override // p046f2.jq
    public int k() {
        return this.hourInputState.d();
    }
}
