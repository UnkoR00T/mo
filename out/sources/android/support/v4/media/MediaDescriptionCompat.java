package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f8023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence f8024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CharSequence f8025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bitmap f8026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f8027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f8028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uri f8029h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaDescription f8030j;

    class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i15) {
            return new MediaDescriptionCompat[i15];
        }
    }

    private static class b {
        static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    private static class c {
        static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f8031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CharSequence f8032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f8033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f8034d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Bitmap f8035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Uri f8036f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f8037g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Uri f8038h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f8031a, this.f8032b, this.f8033c, this.f8034d, this.f8035e, this.f8036f, this.f8037g, this.f8038h);
        }

        public d b(CharSequence charSequence) {
            this.f8034d = charSequence;
            return this;
        }

        public d c(Bundle bundle) {
            this.f8037g = bundle;
            return this;
        }

        public d d(Bitmap bitmap) {
            this.f8035e = bitmap;
            return this;
        }

        public d e(Uri uri) {
            this.f8036f = uri;
            return this;
        }

        public d f(String str) {
            this.f8031a = str;
            return this;
        }

        public d g(Uri uri) {
            this.f8038h = uri;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f8033c = charSequence;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f8032b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f8022a = str;
        this.f8023b = charSequence;
        this.f8024c = charSequence2;
        this.f8025d = charSequence3;
        this.f8026e = bitmap;
        this.f8027f = uri;
        this.f8028g = bundle;
        this.f8029h = uri2;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        d dVar = new d();
        MediaDescription mediaDescription = (MediaDescription) obj;
        dVar.f(b.g(mediaDescription));
        dVar.i(b.i(mediaDescription));
        dVar.h(b.h(mediaDescription));
        dVar.b(b.c(mediaDescription));
        dVar.d(b.e(mediaDescription));
        dVar.e(b.f(mediaDescription));
        Bundle bundleD = b.d(mediaDescription);
        if (bundleD != null) {
            bundleD = MediaSessionCompat.b(bundleD);
        }
        Uri uri = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri == null) {
            bundle = bundleD;
        } else if (!bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleD.size() != 2) {
            bundleD.remove("android.support.v4.media.description.MEDIA_URI");
            bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleD;
        }
        dVar.c(bundle);
        if (uri != null) {
            dVar.g(uri);
        } else {
            dVar.g(c.a(mediaDescription));
        }
        MediaDescriptionCompat mediaDescriptionCompatA = dVar.a();
        mediaDescriptionCompatA.f8030j = mediaDescription;
        return mediaDescriptionCompatA;
    }

    public Object b() {
        MediaDescription mediaDescription = this.f8030j;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderB = b.b();
        b.n(builderB, this.f8022a);
        b.p(builderB, this.f8023b);
        b.o(builderB, this.f8024c);
        b.j(builderB, this.f8025d);
        b.l(builderB, this.f8026e);
        b.m(builderB, this.f8027f);
        b.k(builderB, this.f8028g);
        c.b(builderB, this.f8029h);
        MediaDescription mediaDescriptionA = b.a(builderB);
        this.f8030j = mediaDescriptionA;
        return mediaDescriptionA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f8023b) + ", " + ((Object) this.f8024c) + ", " + ((Object) this.f8025d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        ((MediaDescription) b()).writeToParcel(parcel, i15);
    }
}
