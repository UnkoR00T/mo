package p077m74;

import er.a;
import fr.k;
import fr.t;
import gu.b;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: m74.h0, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lm74/h0;", "", "Lgu/b;", "startDuration", "timeLeft", "Lm74/g0;", "formatter", "Lkotlin/Function0;", "Loq/i0;", "onTimerEnd", "<init>", "(JJLm74/g0;Ler/a;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "c", "Lm74/g0;", "()Lm74/g0;", "d", "Ler/a;", "getOnTimerEnd", "()Ler/a;", "applicationlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TimerData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long startDuration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timeLeft;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final g0 formatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final a<i0> onTimerEnd;

    public /* synthetic */ TimerData(long j15, long j16, g0 g0Var, a aVar, k kVar) {
        this(j15, j16, g0Var, aVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g0 getFormatter() {
        return this.formatter;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getStartDuration() {
        return this.startDuration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTimeLeft() {
        return this.timeLeft;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerData)) {
            return false;
        }
        TimerData timerData = (TimerData) other;
        return b.v(this.startDuration, timerData.startDuration) && b.v(this.timeLeft, timerData.timeLeft) && t.c(this.formatter, timerData.formatter) && t.c(this.onTimerEnd, timerData.onTimerEnd);
    }

    public int hashCode() {
        return (((((b.N(this.startDuration) * 31) + b.N(this.timeLeft)) * 31) + this.formatter.hashCode()) * 31) + this.onTimerEnd.hashCode();
    }

    public String toString() {
        return "TimerData(startDuration=" + ((Object) b.d0(this.startDuration)) + ", timeLeft=" + ((Object) b.d0(this.timeLeft)) + ", formatter=" + this.formatter + ", onTimerEnd=" + this.onTimerEnd + ')';
    }

    private TimerData(long j15, long j16, g0 g0Var, a<i0> aVar) {
        this.startDuration = j15;
        this.timeLeft = j16;
        this.formatter = g0Var;
        this.onTimerEnd = aVar;
    }
}
