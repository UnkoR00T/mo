package c;

import h.q1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import v.u1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0003R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018¨\u0006\u001a"}, d2 = {"Lc/o;", "Lc/n;", "<init>", "()V", "", "Lc/o$a;", "Lv/u1;", "deferrableSurface", "Loq/i0;", "d", "(Ljava/util/List;Lv/u1;)V", "Lh/q1;", "streamId", "Lh/s;", "graph", "c", "(ILv/u1;Lh/s;)V", "a", "(Lv/u1;)V", "b", "", "Ljava/lang/Object;", "lock", "", "Ljava/util/List;", "configuredOutputs", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<ConfiguredOutput> configuredOutputs = new ArrayList();

    /* JADX INFO: renamed from: c.o$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lc/o$a;", "", "Lh/q1;", "streamId", "Lv/u1;", "deferrableSurface", "Lh/s;", "graph", "<init>", "(ILv/u1;Lh/s;Lfr/k;)V", "Loq/i0;", "a", "()V", "", "b", "(Lv/u1;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getStreamId-ptHMqGs", "Lv/u1;", "getDeferrableSurface", "()Lv/u1;", "c", "Lh/s;", "getGraph", "()Lh/s;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConfiguredOutput {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int streamId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final u1 deferrableSurface;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final h.s graph;

        public /* synthetic */ ConfiguredOutput(int i15, u1 u1Var, h.s sVar, fr.k kVar) {
            this(i15, u1Var, sVar);
        }

        public final void a() {
            this.graph.H1(this.streamId, null);
            this.deferrableSurface.d();
        }

        public final boolean b(u1 deferrableSurface) {
            return fr.t.c(this.deferrableSurface, deferrableSurface);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfiguredOutput)) {
                return false;
            }
            ConfiguredOutput configuredOutput = (ConfiguredOutput) other;
            return q1.d(this.streamId, configuredOutput.streamId) && fr.t.c(this.deferrableSurface, configuredOutput.deferrableSurface) && fr.t.c(this.graph, configuredOutput.graph);
        }

        public int hashCode() {
            return (((q1.e(this.streamId) * 31) + this.deferrableSurface.hashCode()) * 31) + this.graph.hashCode();
        }

        public String toString() {
            return "ConfiguredOutput(streamId=" + ((Object) q1.f(this.streamId)) + ", deferrableSurface=" + this.deferrableSurface + ", graph=" + this.graph + ')';
        }

        private ConfiguredOutput(int i15, u1 u1Var, h.s sVar) {
            this.streamId = i15;
            this.deferrableSurface = u1Var;
            this.graph = sVar;
        }
    }

    private final void d(List<ConfiguredOutput> list, u1 u1Var) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((ConfiguredOutput) it.next()).b(u1Var)) {
                u1Var.d();
            }
        }
    }

    @Override // c.n
    public void a(u1 deferrableSurface) {
        synchronized (this.lock) {
            d(this.configuredOutputs, deferrableSurface);
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    @Override // c.n
    public void b() {
        synchronized (this.lock) {
            try {
                Iterator<T> it = this.configuredOutputs.iterator();
                while (it.hasNext()) {
                    ((ConfiguredOutput) it.next()).a();
                }
                this.configuredOutputs.clear();
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // c.n
    public void c(int streamId, u1 deferrableSurface, h.s graph) {
        synchronized (this.lock) {
            this.configuredOutputs.add(new ConfiguredOutput(streamId, deferrableSurface, graph, null));
        }
    }
}
