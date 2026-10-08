package yx;

import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yx.c, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lyx/c;", "", "Lyx/b;", "mediaPlayerPlaybackState", "Lgu/b;", "mediaPlayerTotalDuration", "<init>", "(Lyx/b;JLfr/k;)V", "a", "(Lyx/b;J)Lyx/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lyx/b;", "b", "()Lyx/b;", "J", "c", "()J", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MediaPlayerState {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f230171c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b mediaPlayerPlaybackState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long mediaPlayerTotalDuration;

    public /* synthetic */ MediaPlayerState(b bVar, long j15, k kVar) {
        this(bVar, j15);
    }

    public final MediaPlayerState a(b mediaPlayerPlaybackState, long mediaPlayerTotalDuration) {
        return new MediaPlayerState(mediaPlayerPlaybackState, mediaPlayerTotalDuration, null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getMediaPlayerPlaybackState() {
        return this.mediaPlayerPlaybackState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getMediaPlayerTotalDuration() {
        return this.mediaPlayerTotalDuration;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaPlayerState)) {
            return false;
        }
        MediaPlayerState mediaPlayerState = (MediaPlayerState) other;
        return this.mediaPlayerPlaybackState == mediaPlayerState.mediaPlayerPlaybackState && gu.b.v(this.mediaPlayerTotalDuration, mediaPlayerState.mediaPlayerTotalDuration);
    }

    public int hashCode() {
        return (this.mediaPlayerPlaybackState.hashCode() * 31) + gu.b.N(this.mediaPlayerTotalDuration);
    }

    public String toString() {
        return "MediaPlayerState(mediaPlayerPlaybackState=" + this.mediaPlayerPlaybackState + ", mediaPlayerTotalDuration=" + gu.b.d0(this.mediaPlayerTotalDuration) + ")";
    }

    private MediaPlayerState(b bVar, long j15) {
        this.mediaPlayerPlaybackState = bVar;
        this.mediaPlayerTotalDuration = j15;
    }
}
