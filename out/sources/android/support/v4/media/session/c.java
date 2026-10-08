package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaMetadataCompat;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final MediaController.Callback f8084a = new a(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    android.support.v4.media.session.a f8085b;

    private static class a extends MediaController.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<c> f8086a;

        a(c cVar) {
            this.f8086a = new WeakReference<>(cVar);
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            c cVar = this.f8086a.get();
            if (cVar != null) {
                cVar.a(new d(playbackInfo.getPlaybackType(), AudioAttributesCompat.c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = this.f8086a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            c cVar = this.f8086a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.a(mediaMetadata));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            c cVar = this.f8086a.get();
            if (cVar == null || cVar.f8085b != null) {
                return;
            }
            cVar.d(PlaybackStateCompat.a(playbackState));
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            c cVar = this.f8086a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.b(list));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            c cVar = this.f8086a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            c cVar = this.f8086a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = this.f8086a.get();
            if (cVar != null) {
                cVar.h(str, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends android.support.v4.media.session.a.AbstractBinderC0182a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final WeakReference<c> f8087d;

        b(c cVar) {
            this.f8087d = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.a
        public void D2(boolean z15) {
        }

        @Override // android.support.v4.media.session.a
        public void P2(int i15) {
            c cVar = this.f8087d.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i15), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void c0() {
            c cVar = this.f8087d.get();
            if (cVar != null) {
                cVar.i(13, null, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void f3(PlaybackStateCompat playbackStateCompat) {
            c cVar = this.f8087d.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void h3(String str, Bundle bundle) {
            c cVar = this.f8087d.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }

        @Override // android.support.v4.media.session.a
        public void l1(int i15) {
            c cVar = this.f8087d.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i15), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void q2(boolean z15) {
            c cVar = this.f8087d.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z15), null);
            }
        }
    }

    public void a(d dVar) {
    }

    public void b(Bundle bundle) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        i(8, null, null);
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List<MediaSessionCompat.QueueItem> list) {
    }

    public void f(CharSequence charSequence) {
    }

    public void g() {
    }

    public void h(String str, Bundle bundle) {
    }

    void i(int i15, Object obj, Bundle bundle) {
    }
}
