package f00;

import androidx.p016lifecycle.t0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: f00.i0, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Lf00/i0;", "", "Ljava/lang/Class;", "Lzx/a;", "destinationClass", "Landroidx/lifecycle/t0;", "vmClass", "Lkotlin/Function1;", "Loq/i0;", "screen", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ler/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Class;", "()Ljava/lang/Class;", "b", "c", "Ler/q;", "()Ler/q;", "navigation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedDestinationSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Class<? extends zx.a> destinationClass;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Class<? extends t0> vmClass;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.q<t0, p076m2.r, Integer, oq.i0> screen;

    /* JADX WARN: Multi-variable type inference failed */
    public SharedDestinationSpec(Class<? extends zx.a> cls, Class<? extends t0> cls2, er.q<? super t0, ? super p076m2.r, ? super Integer, oq.i0> qVar) {
        this.destinationClass = cls;
        this.vmClass = cls2;
        this.screen = qVar;
    }

    public final Class<? extends zx.a> a() {
        return this.destinationClass;
    }

    public final er.q<t0, p076m2.r, Integer, oq.i0> b() {
        return this.screen;
    }

    public final Class<? extends t0> c() {
        return this.vmClass;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedDestinationSpec)) {
            return false;
        }
        SharedDestinationSpec sharedDestinationSpec = (SharedDestinationSpec) other;
        return fr.t.c(this.destinationClass, sharedDestinationSpec.destinationClass) && fr.t.c(this.vmClass, sharedDestinationSpec.vmClass) && fr.t.c(this.screen, sharedDestinationSpec.screen);
    }

    public int hashCode() {
        return (((this.destinationClass.hashCode() * 31) + this.vmClass.hashCode()) * 31) + this.screen.hashCode();
    }

    public String toString() {
        return "SharedDestinationSpec(destinationClass=" + this.destinationClass + ", vmClass=" + this.vmClass + ", screen=" + this.screen + ')';
    }
}
