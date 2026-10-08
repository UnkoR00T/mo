package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f8065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f8066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f8067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f8068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f8069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f8070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final CharSequence f8071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final long f8072h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    List<CustomAction> f8073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final long f8074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Bundle f8075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private PlaybackState f8076m;

    class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i15) {
            return new PlaybackStateCompat[i15];
        }
    }

    private static class b {
        static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i15) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i15);
        }

        static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        static void s(PlaybackState.Builder builder, long j15) {
            builder.setActions(j15);
        }

        static void t(PlaybackState.Builder builder, long j15) {
            builder.setActiveQueueItemId(j15);
        }

        static void u(PlaybackState.Builder builder, long j15) {
            builder.setBufferedPosition(j15);
        }

        static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void x(PlaybackState.Builder builder, int i15, long j15, float f15, long j16) {
            builder.setState(i15, j15, f15, j16);
        }
    }

    private static class c {
        static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    PlaybackStateCompat(int i15, long j15, long j16, float f15, long j17, int i16, CharSequence charSequence, long j18, List<CustomAction> list, long j19, Bundle bundle) {
        this.f8065a = i15;
        this.f8066b = j15;
        this.f8067c = j16;
        this.f8068d = f15;
        this.f8069e = j17;
        this.f8070f = i16;
        this.f8071g = charSequence;
        this.f8072h = j18;
        this.f8073j = new ArrayList(list);
        this.f8074k = j19;
        this.f8075l = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> listJ = b.j(playbackState);
        if (listJ != null) {
            arrayList = new ArrayList(listJ.size());
            Iterator<PlaybackState.CustomAction> it = listJ.iterator();
            while (it.hasNext()) {
                arrayList.add(CustomAction.a(it.next()));
            }
        }
        Bundle bundleA = c.a(playbackState);
        MediaSessionCompat.a(bundleA);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), arrayList, b.h(playbackState), bundleA);
        playbackStateCompat.f8076m = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f8065a + ", position=" + this.f8066b + ", buffered position=" + this.f8067c + ", speed=" + this.f8068d + ", updated=" + this.f8072h + ", actions=" + this.f8069e + ", error code=" + this.f8070f + ", error message=" + this.f8071g + ", custom actions=" + this.f8073j + ", active item id=" + this.f8074k + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        parcel.writeInt(this.f8065a);
        parcel.writeLong(this.f8066b);
        parcel.writeFloat(this.f8068d);
        parcel.writeLong(this.f8072h);
        parcel.writeLong(this.f8067c);
        parcel.writeLong(this.f8069e);
        TextUtils.writeToParcel(this.f8071g, parcel, i15);
        parcel.writeTypedList(this.f8073j);
        parcel.writeLong(this.f8074k);
        parcel.writeBundle(this.f8075l);
        parcel.writeInt(this.f8070f);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence f8078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f8079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Bundle f8080d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private PlaybackState.CustomAction f8081e;

        class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i15) {
                return new CustomAction[i15];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i15, Bundle bundle) {
            this.f8077a = str;
            this.f8078b = charSequence;
            this.f8079c = i15;
            this.f8080d = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle bundleL = b.l(customAction);
            MediaSessionCompat.a(bundleL);
            CustomAction customAction2 = new CustomAction(b.f(customAction), b.o(customAction), b.m(customAction), bundleL);
            customAction2.f8081e = customAction;
            return customAction2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f8078b) + ", mIcon=" + this.f8079c + ", mExtras=" + this.f8080d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            parcel.writeString(this.f8077a);
            TextUtils.writeToParcel(this.f8078b, parcel, i15);
            parcel.writeInt(this.f8079c);
            parcel.writeBundle(this.f8080d);
        }

        CustomAction(Parcel parcel) {
            this.f8077a = parcel.readString();
            this.f8078b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f8079c = parcel.readInt();
            this.f8080d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f8065a = parcel.readInt();
        this.f8066b = parcel.readLong();
        this.f8068d = parcel.readFloat();
        this.f8072h = parcel.readLong();
        this.f8067c = parcel.readLong();
        this.f8069e = parcel.readLong();
        this.f8071g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f8073j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f8074k = parcel.readLong();
        this.f8075l = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f8070f = parcel.readInt();
    }
}
