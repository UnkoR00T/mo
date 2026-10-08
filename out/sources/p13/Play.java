package p13;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: p13.e, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lp13/e;", "", "Lr13/a;", "alertMediaPlayer", "<init>", "(Lr13/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr13/a;", "()Lr13/a;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Play {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final r13.a alertMediaPlayer;

    public Play(r13.a aVar) {
        this.alertMediaPlayer = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final r13.a getAlertMediaPlayer() {
        return this.alertMediaPlayer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Play) && this.alertMediaPlayer == ((Play) other).alertMediaPlayer;
    }

    public int hashCode() {
        return this.alertMediaPlayer.hashCode();
    }

    public String toString() {
        return "Play(alertMediaPlayer=" + this.alertMediaPlayer + ')';
    }
}
