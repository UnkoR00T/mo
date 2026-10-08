package p13;

import p071kotlin.Metadata;
import yx.MediaPlayerState;

/* JADX INFO: renamed from: p13.i, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lp13/i;", "", "Lyx/c;", "alarmAnnouncementMediaPlayerState", "Lgu/b;", "alarmAnnouncementMediaPlayerCurrentPosition", "alarmCancellationMediaPlayerState", "alarmCancellationMediaPlayerCurrentPosition", "<init>", "(Lyx/c;JLyx/c;JLfr/k;)V", "a", "(Lyx/c;JLyx/c;J)Lp13/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lyx/c;", "d", "()Lyx/c;", "b", "J", "c", "()J", "f", "e", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f151552e = MediaPlayerState.f230171c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final MediaPlayerState alarmAnnouncementMediaPlayerState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long alarmAnnouncementMediaPlayerCurrentPosition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final MediaPlayerState alarmCancellationMediaPlayerState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long alarmCancellationMediaPlayerCurrentPosition;

    public /* synthetic */ State(MediaPlayerState mediaPlayerState, long j15, MediaPlayerState mediaPlayerState2, long j16, fr.k kVar) {
        this(mediaPlayerState, j15, mediaPlayerState2, j16);
    }

    public static /* synthetic */ State b(State state, MediaPlayerState mediaPlayerState, long j15, MediaPlayerState mediaPlayerState2, long j16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            mediaPlayerState = state.alarmAnnouncementMediaPlayerState;
        }
        if ((i15 & 2) != 0) {
            j15 = state.alarmAnnouncementMediaPlayerCurrentPosition;
        }
        if ((i15 & 4) != 0) {
            mediaPlayerState2 = state.alarmCancellationMediaPlayerState;
        }
        if ((i15 & 8) != 0) {
            j16 = state.alarmCancellationMediaPlayerCurrentPosition;
        }
        MediaPlayerState mediaPlayerState3 = mediaPlayerState2;
        return state.a(mediaPlayerState, j15, mediaPlayerState3, j16);
    }

    public final State a(MediaPlayerState alarmAnnouncementMediaPlayerState, long alarmAnnouncementMediaPlayerCurrentPosition, MediaPlayerState alarmCancellationMediaPlayerState, long alarmCancellationMediaPlayerCurrentPosition) {
        return new State(alarmAnnouncementMediaPlayerState, alarmAnnouncementMediaPlayerCurrentPosition, alarmCancellationMediaPlayerState, alarmCancellationMediaPlayerCurrentPosition, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getAlarmAnnouncementMediaPlayerCurrentPosition() {
        return this.alarmAnnouncementMediaPlayerCurrentPosition;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final MediaPlayerState getAlarmAnnouncementMediaPlayerState() {
        return this.alarmAnnouncementMediaPlayerState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getAlarmCancellationMediaPlayerCurrentPosition() {
        return this.alarmCancellationMediaPlayerCurrentPosition;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.alarmAnnouncementMediaPlayerState, state.alarmAnnouncementMediaPlayerState) && gu.b.v(this.alarmAnnouncementMediaPlayerCurrentPosition, state.alarmAnnouncementMediaPlayerCurrentPosition) && fr.t.c(this.alarmCancellationMediaPlayerState, state.alarmCancellationMediaPlayerState) && gu.b.v(this.alarmCancellationMediaPlayerCurrentPosition, state.alarmCancellationMediaPlayerCurrentPosition);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final MediaPlayerState getAlarmCancellationMediaPlayerState() {
        return this.alarmCancellationMediaPlayerState;
    }

    public int hashCode() {
        return (((((this.alarmAnnouncementMediaPlayerState.hashCode() * 31) + gu.b.N(this.alarmAnnouncementMediaPlayerCurrentPosition)) * 31) + this.alarmCancellationMediaPlayerState.hashCode()) * 31) + gu.b.N(this.alarmCancellationMediaPlayerCurrentPosition);
    }

    public String toString() {
        return "State(alarmAnnouncementMediaPlayerState=" + this.alarmAnnouncementMediaPlayerState + ", alarmAnnouncementMediaPlayerCurrentPosition=" + ((Object) gu.b.d0(this.alarmAnnouncementMediaPlayerCurrentPosition)) + ", alarmCancellationMediaPlayerState=" + this.alarmCancellationMediaPlayerState + ", alarmCancellationMediaPlayerCurrentPosition=" + ((Object) gu.b.d0(this.alarmCancellationMediaPlayerCurrentPosition)) + ')';
    }

    private State(MediaPlayerState mediaPlayerState, long j15, MediaPlayerState mediaPlayerState2, long j16) {
        this.alarmAnnouncementMediaPlayerState = mediaPlayerState;
        this.alarmAnnouncementMediaPlayerCurrentPosition = j15;
        this.alarmCancellationMediaPlayerState = mediaPlayerState2;
        this.alarmCancellationMediaPlayerCurrentPosition = j16;
    }
}
