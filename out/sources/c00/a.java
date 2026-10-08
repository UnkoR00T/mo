package c00;

import a8.x;
import android.content.Context;
import gu.d;
import gu.e;
import lr.m;
import mu.b0;
import mu.i;
import mu.p0;
import mu.r0;
import p071kotlin.Metadata;
import t7.a0;
import t7.s;
import yx.MediaPlayerState;
import yx.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0014\u0010)\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010(¨\u0006*"}, d2 = {"Lc00/a;", "Lyx/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "uri", "Loq/i0;", "c", "(Ljava/lang/String;)V", "h", "()V", "g", "d", "", "position", "seekTo", "(J)V", "b", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "La8/x;", "La8/x;", "player", "Lt7/a0$d;", "Lt7/a0$d;", "playerListener", "Lmu/b0;", "Lyx/c;", "Lmu/b0;", "_mediaPlayerState", "Lmu/p0;", "e", "Lmu/p0;", "()Lmu/p0;", "mediaPlayerState", "Lgu/b;", "()J", "mediaPlayerCurrentPosition", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements yx.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private x player;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private a0.d playerListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b0<MediaPlayerState> _mediaPlayerState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<MediaPlayerState> mediaPlayerState;

    /* JADX INFO: renamed from: c00.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"c00/a$a", "Lt7/a0$d;", "Lt7/a0;", "player", "Lt7/a0$c;", "events", "Loq/i0;", "K", "(Lt7/a0;Lt7/a0$c;)V", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0591a implements a0.d {
        C0591a() {
        }

        @Override // t7.a0.d
        public void K(a0 player, a0.c events) {
            Object value;
            MediaPlayerState mediaPlayerState;
            b bVar;
            super.K(player, events);
            b0 b0Var = a.this._mediaPlayerState;
            do {
                value = b0Var.getValue();
                mediaPlayerState = (MediaPlayerState) value;
                int iB = player.B();
                if (iB == 1) {
                    bVar = b.IDLE;
                } else if (iB != 4) {
                    bVar = player.C() ? b.PLAYING : b.PAUSE;
                } else {
                    bVar = b.ENDED;
                }
                gu.b.Companion companion = gu.b.INSTANCE;
            } while (!b0Var.s(value, mediaPlayerState.a(bVar, d.r(m.f(player.getDuration(), 0L), e.MILLISECONDS))));
        }
    }

    public a(Context context) {
        this.context = context;
        b0<MediaPlayerState> b0VarA = r0.a(new MediaPlayerState(b.IDLE, gu.b.INSTANCE.d(), null));
        this._mediaPlayerState = b0VarA;
        this.mediaPlayerState = i.b(b0VarA);
    }

    @Override // yx.a
    public long a() {
        x xVar = this.player;
        if (xVar == null) {
            return gu.b.INSTANCE.d();
        }
        long jF = m.f(xVar.G(), 0L);
        gu.b.Companion companion = gu.b.INSTANCE;
        return d.r(jF, e.MILLISECONDS);
    }

    @Override // yx.a
    public void b() {
        x xVar = this.player;
        if (xVar != null) {
            a0.d dVar = this.playerListener;
            if (dVar != null) {
                xVar.l(dVar);
            }
            xVar.b();
        }
        this.player = null;
        this.playerListener = null;
    }

    @Override // yx.a
    public void c(String uri) {
        this.playerListener = new C0591a();
        x xVarE = new x.b(this.context).e();
        a0.d dVar = this.playerListener;
        if (dVar != null) {
            xVarE.i(dVar);
        }
        xVarE.t(s.b(uri));
        xVarE.a();
        this.player = xVarE;
    }

    @Override // yx.a
    public void d() {
        x xVar = this.player;
        if (xVar != null) {
            xVar.seekTo(0L);
        }
        x xVar2 = this.player;
        if (xVar2 != null) {
            xVar2.h();
        }
    }

    @Override // yx.a
    public p0<MediaPlayerState> e() {
        return this.mediaPlayerState;
    }

    @Override // yx.a
    public void g() {
        x xVar = this.player;
        if (xVar != null) {
            xVar.g();
        }
    }

    @Override // yx.a
    public void h() {
        x xVar = this.player;
        if (xVar != null) {
            xVar.h();
        }
    }

    @Override // yx.a
    public void seekTo(long position) {
        x xVar = this.player;
        if (xVar != null) {
            xVar.seekTo(position);
        }
    }
}
