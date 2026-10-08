package c8;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ak.n0<Integer> f24197a = ak.n0.E(12);

    private static ak.n0<Integer> a() {
        return f24197a;
    }

    private static ak.n0<Integer> b(AudioDeviceInfo audioDeviceInfo) {
        int speakerLayoutChannelMask;
        if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
            return ak.n0.E(Integer.valueOf(speakerLayoutChannelMask));
        }
        w7.t.h("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
        return f24197a;
    }

    private static ak.n0<Integer> c(AudioDeviceInfo audioDeviceInfo) {
        ak.n0<Integer> n0VarF = f(audioDeviceInfo);
        if (!n0VarF.isEmpty()) {
            return n0VarF;
        }
        ak.n0<Integer> n0VarC = h.c(audioDeviceInfo.getAudioDescriptors());
        return !n0VarC.isEmpty() ? n0VarC : f24197a;
    }

    private static ak.n0<Integer> d(AudioDeviceInfo audioDeviceInfo) {
        ak.n0<Integer> n0VarF = f(audioDeviceInfo);
        if (!n0VarF.isEmpty()) {
            return n0VarF;
        }
        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
        if (Build.VERSION.SDK_INT >= 34) {
            ak.n0<Integer> n0VarB = h.b(audioDescriptors);
            if (!n0VarB.isEmpty()) {
                return n0VarB;
            }
        }
        ak.n0<Integer> n0VarC = h.c(audioDescriptors);
        return !n0VarC.isEmpty() ? n0VarC : f24197a;
    }

    private static ak.n0<Integer> e(AudioDeviceInfo audioDeviceInfo) {
        ak.n0<Integer> n0VarF = f(audioDeviceInfo);
        return !n0VarF.isEmpty() ? n0VarF : f24197a;
    }

    private static ak.n0<Integer> f(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(new g()).reversed());
        Iterator<AudioProfile> it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile audioProfileA = a.a(it.next());
            if (audioProfileA.getEncapsulationType() != 1 && w7.o0.y0(audioProfileA.getFormat())) {
                for (int i15 : audioProfileA.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i15));
                }
            }
        }
        return ak.n0.v(treeSet);
    }

    public static ak.n0<Integer> g(AudioDeviceInfo audioDeviceInfo) {
        if (y0.a(audioDeviceInfo.getType())) {
            return a();
        }
        if (y0.b(audioDeviceInfo.getType())) {
            return ak.n0.E(4);
        }
        if (y0.c(audioDeviceInfo.getType())) {
            return b(audioDeviceInfo);
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 31 && y0.d(audioDeviceInfo.getType())) {
            return c(audioDeviceInfo);
        }
        if (i15 < 31 || !y0.e(audioDeviceInfo.getType())) {
            return (i15 < 31 || !y0.f(audioDeviceInfo.getType())) ? f24197a : e(audioDeviceInfo);
        }
        return d(audioDeviceInfo);
    }
}
