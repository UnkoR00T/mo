package k00;

import androidx.p016lifecycle.t0;
import java.util.UUID;
import mu.b0;
import mu.r0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\r\u001a\u00028\u0003\"\b\b\u0003\u0010\t*\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00030\n2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0005¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b!\u0010\u0019¨\u0006#"}, d2 = {"Lk00/a;", "EVENT", "STATE", "COMMAND", "Lty/c;", "initialState", "<init>", "(Ljava/lang/Object;)V", "Landroidx/lifecycle/t0;", "VM", "Ljava/lang/Class;", "modelClass", "adapter", "f", "(Ljava/lang/Class;Lty/c;Lm2/r;I)Landroidx/lifecycle/t0;", "", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "key", "Lxw/b;", "b", "Lxw/b;", "d", "()Lxw/b;", "event", "Lmu/b0;", "c", "Lmu/b0;", "getState", "()Lmu/b0;", "state", "e", "command", "navigation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a<EVENT, STATE, COMMAND> implements ty.c<EVENT, STATE, COMMAND> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f107183e = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b0<STATE> state;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String key = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xw.b<EVENT> event = new xw.b<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<COMMAND> command = new xw.b<>();

    public a(STATE state) {
        this.state = r0.a(state);
    }

    @Override // ty.b
    public xw.b<EVENT> d() {
        return this.event;
    }

    @Override // ty.b
    public xw.b<COMMAND> e() {
        return this.command;
    }

    protected final <VM extends t0> VM f(Class<? extends VM> cls, ty.c<?, ?, ?> cVar, r rVar, int i15) {
        if (t.k()) {
            t.o(791758758, i15, -1, "pl.gov.coi.common.navigation.segment.BaseVMSAdapter.createViewModelSegment (BaseVMSAdapter.kt:26)");
        }
        VM vm4 = (VM) c.b(getKey(), cls, cVar, rVar, (i15 << 3) & 1008);
        if (t.k()) {
            t.n();
        }
        return vm4;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public String getKey() {
        return this.key;
    }

    @Override // ty.c
    public b0<STATE> getState() {
        return this.state;
    }
}
