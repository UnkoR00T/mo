package c8;

import ak.h2;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ak.n0<Integer> f24128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ak.n0<Integer> f24129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f24130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    private static final ak.n0<Integer> f24131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final ak.p0<Integer, Integer> f24132i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<d> f24133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ak.n0<Integer> f24135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ak.n0<Integer> f24136d;

    /* JADX INFO: renamed from: c8.b$b, reason: collision with other inner class name */
    private static final class C0645b {
        public static ak.n0<Integer> a(t7.b bVar) {
            ak.n0.a aVarS = ak.n0.s();
            h2<Integer> it = b.f24132i.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                int iIntValue = next.intValue();
                if (Build.VERSION.SDK_INT >= w7.o0.J(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), bVar.a())) {
                    aVarS.a(next);
                }
            }
            aVarS.a(2);
            return aVarS.k();
        }

        public static int b(int i15, int i16, t7.b bVar) {
            for (int i17 = 10; i17 > 0; i17--) {
                int iL = w7.o0.L(i17);
                if (iL != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i15).setSampleRate(i16).setChannelMask(iL).build(), bVar.a())) {
                    return i17;
                }
            }
            return 0;
        }
    }

    private static final class c {
        public static b a(AudioManager audioManager, t7.b bVar, List<Integer> list, List<Integer> list2) {
            return new b(b.c(audioManager.getDirectProfilesForAttributes(bVar.a())), list, list2);
        }

        public static AudioDeviceInfo b(AudioManager audioManager, t7.b bVar) {
            List<AudioDeviceInfo> audioDevicesForAttributes = ((AudioManager) zj.p.q(audioManager)).getAudioDevicesForAttributes(bVar.a());
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return audioDevicesForAttributes.get(0);
        }
    }

    static {
        ak.n0<Integer> n0VarE = ak.n0.E(12);
        f24128e = n0VarE;
        ak.n0<Integer> n0VarC = ak.n0.C();
        f24129f = n0VarC;
        f24130g = new b(ak.n0.E(d.f24137d), n0VarE, n0VarC);
        f24131h = ak.n0.G(2, 5, 6);
        f24132i = new ak.p0.a().g(5, 6).g(17, 6).g(7, 6).g(30, 10).g(18, 6).g(6, 8).g(8, 8).g(14, 8).d();
    }

    private static boolean b() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WrongConstant"})
    public static ak.n0<d> c(List<AudioProfile> list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(ek.g.c(12)));
        for (int i15 = 0; i15 < list.size(); i15++) {
            AudioProfile audioProfileA = c8.a.a(list.get(i15));
            if (audioProfileA.getEncapsulationType() != 1) {
                int format = audioProfileA.getFormat();
                if (w7.o0.y0(format) || f24132i.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) zj.p.q((Set) map.get(Integer.valueOf(format)))).addAll(ek.g.c(audioProfileA.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(ek.g.c(audioProfileA.getChannelMasks())));
                    }
                }
            }
        }
        ak.n0.a aVarS = ak.n0.s();
        for (Map.Entry entry : map.entrySet()) {
            aVarS.a(new d(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return aVarS.k();
    }

    private static ak.n0<d> d(int[] iArr, int i15) {
        ak.n0.a aVarS = ak.n0.s();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i16 : iArr) {
            aVarS.a(new d(i16, i15));
        }
        return aVarS.k();
    }

    @SuppressLint({"InlinedApi"})
    static b e(Context context, Intent intent, t7.b bVar, AudioDeviceInfo audioDeviceInfo, List<Integer> list) {
        AudioManager audioManagerC = u7.j.c(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? c.b(audioManagerC, bVar) : null;
        }
        ak.n0<Integer> n0VarG = audioDeviceInfo != null ? e1.g(audioDeviceInfo) : f24128e;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 33 && (w7.o0.D0(context) || w7.o0.v0(context))) {
            return c.a(audioManagerC, bVar, n0VarG, list);
        }
        if (l(audioManagerC, audioDeviceInfo)) {
            return new b(ak.n0.E(d.f24137d), n0VarG, list);
        }
        ak.u0.a aVar = new ak.u0.a();
        aVar.a(2);
        if (i15 >= 29 && (w7.o0.D0(context) || w7.o0.v0(context))) {
            aVar.i(C0645b.a(bVar));
            return new b(d(ek.g.n(aVar.k()), 10), n0VarG, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z15 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z15 || b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            aVar.i(f24131h);
        }
        if (intent == null || z15 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new b(d(ek.g.n(aVar.k()), 10), n0VarG, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar.i(ek.g.c(intArrayExtra));
        }
        return new b(d(ek.g.n(aVar.k()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), n0VarG, list);
    }

    @SuppressLint({"UnprotectedReceiver"})
    static b f(Context context, t7.b bVar, AudioDeviceInfo audioDeviceInfo, List<Integer> list) {
        return e(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), bVar, audioDeviceInfo, list);
    }

    private static int g(int i15) {
        int i16 = Build.VERSION.SDK_INT;
        if (i16 <= 28) {
            if (i15 == 7) {
                i15 = 8;
            } else if (i15 == 3 || i15 == 4 || i15 == 5) {
                i15 = 6;
            }
        }
        if (i16 <= 26 && "fugu".equals(Build.DEVICE) && i15 == 1) {
            i15 = 2;
        }
        return w7.o0.L(i15);
    }

    static Uri i() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean l(AudioManager audioManager, AudioDeviceInfo audioDeviceInfo) {
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? ((AudioManager) zj.p.q(audioManager)).getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (y0.a(audioDeviceInfo2.getType())) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return w7.o0.s(this.f24133a, bVar.f24133a) && this.f24134b == bVar.f24134b && Objects.equals(this.f24135c, bVar.f24135c) && Objects.equals(this.f24136d, bVar.f24136d);
    }

    public Pair<Integer, Integer> h(t7.p pVar, t7.b bVar) {
        int iB = t7.w.b((String) zj.p.q(pVar.f188381p), pVar.f188376k);
        if (!f24132i.containsKey(Integer.valueOf(iB))) {
            return null;
        }
        if (iB == 18 && !n(18)) {
            iB = 6;
        } else if ((iB == 8 && !n(8)) || (iB == 30 && !n(30))) {
            iB = 7;
        }
        if (!n(iB)) {
            return null;
        }
        d dVar = (d) zj.p.q(this.f24133a.get(iB));
        int iB2 = pVar.H;
        if (iB2 == -1 || iB == 18) {
            int i15 = pVar.I;
            if (i15 == -1) {
                i15 = 48000;
            }
            iB2 = dVar.b(i15, bVar);
        } else if (!pVar.f188381p.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!dVar.c(iB2)) {
                return null;
            }
        } else if (iB2 > 10) {
            return null;
        }
        int iG = g(iB2);
        if (iG == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iB), Integer.valueOf(iG));
    }

    public int hashCode() {
        return (((((this.f24134b * 31) + w7.o0.t(this.f24133a)) * 31) + Objects.hashCode(this.f24135c)) * 31) + Objects.hashCode(this.f24136d);
    }

    public ak.n0<Integer> j() {
        return this.f24136d;
    }

    public ak.n0<Integer> k() {
        return this.f24135c;
    }

    public boolean m(t7.p pVar, t7.b bVar) {
        return h(pVar, bVar) != null;
    }

    public boolean n(int i15) {
        return w7.o0.q(this.f24133a, i15);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f24134b + ", audioProfiles=" + this.f24133a + ", speakerLayoutChannelMasks=" + this.f24135c + ", spatializerChannelMasks=" + this.f24136d + "]";
    }

    private b(List<d> list, List<Integer> list2, List<Integer> list3) {
        this.f24133a = new SparseArray<>();
        for (int i15 = 0; i15 < list.size(); i15++) {
            d dVar = list.get(i15);
            this.f24133a.put(dVar.f24138a, dVar);
        }
        int iMax = 0;
        for (int i16 = 0; i16 < this.f24133a.size(); i16++) {
            iMax = Math.max(iMax, this.f24133a.valueAt(i16).f24139b);
        }
        this.f24134b = iMax;
        this.f24135c = ak.n0.v(list2);
        this.f24136d = ak.n0.v(list3);
    }

    private static final class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f24137d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ak.u0<Integer> f24140c;

        static {
            f24137d = Build.VERSION.SDK_INT >= 33 ? new d(2, a(10)) : new d(2, 10);
        }

        public d(int i15, Set<Integer> set) {
            this.f24138a = i15;
            ak.u0<Integer> u0VarV = ak.u0.v(set);
            this.f24140c = u0VarV;
            h2<Integer> it = u0VarV.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(it.next().intValue()));
            }
            this.f24139b = iMax;
        }

        private static ak.u0<Integer> a(int i15) {
            ak.u0.a aVar = new ak.u0.a();
            for (int i16 = 1; i16 <= i15; i16++) {
                aVar.a(Integer.valueOf(w7.o0.L(i16)));
            }
            return aVar.k();
        }

        public int b(int i15, t7.b bVar) {
            if (this.f24140c != null) {
                return this.f24139b;
            }
            return Build.VERSION.SDK_INT >= 29 ? C0645b.b(this.f24138a, i15, bVar) : ((Integer) zj.p.q(b.f24132i.getOrDefault(Integer.valueOf(this.f24138a), 0))).intValue();
        }

        public boolean c(int i15) {
            if (this.f24140c == null) {
                return i15 <= this.f24139b;
            }
            int iL = w7.o0.L(i15);
            if (iL == 0) {
                return false;
            }
            return this.f24140c.contains(Integer.valueOf(iL));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f24138a == dVar.f24138a && this.f24139b == dVar.f24139b && Objects.equals(this.f24140c, dVar.f24140c);
        }

        public int hashCode() {
            int i15 = ((this.f24138a * 31) + this.f24139b) * 31;
            ak.u0<Integer> u0Var = this.f24140c;
            return i15 + (u0Var == null ? 0 : u0Var.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.f24138a + ", maxChannelCount=" + this.f24139b + ", channelMasks=" + this.f24140c + "]";
        }

        public d(int i15, int i16) {
            this.f24138a = i15;
            this.f24139b = i16;
            this.f24140c = null;
        }
    }
}
