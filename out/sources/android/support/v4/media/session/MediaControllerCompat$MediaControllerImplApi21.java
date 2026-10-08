package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import io.sentry.android.core.c2;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import s5.g;

/* JADX INFO: loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f8047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f8048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<c, a> f8049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final MediaSessionCompat.Token f8050d;

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f8051a;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i15, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f8051a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f8047a) {
                mediaControllerCompat$MediaControllerImplApi21.f8050d.b(b.a.l3(g.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f8050d.c(gb.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }

    private static class a extends c.b {
        a(c cVar) {
            super(cVar);
        }

        @Override // android.support.v4.media.session.a
        public void F1(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void G2(CharSequence charSequence) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void S0() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void T0(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void V1(Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void l0(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }
    }

    void a() {
        if (this.f8050d.a() == null) {
            return;
        }
        for (c cVar : this.f8048b) {
            a aVar = new a(cVar);
            this.f8049c.put(cVar, aVar);
            cVar.f8085b = aVar;
            try {
                this.f8050d.a().K1(aVar);
                cVar.i(13, null, null);
            } catch (RemoteException e15) {
                c2.f("MediaControllerCompat", "Dead object in registerCallback.", e15);
            }
        }
        this.f8048b.clear();
    }
}
