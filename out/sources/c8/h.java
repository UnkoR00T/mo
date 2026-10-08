package c8;

import android.media.AudioDescriptor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
final class h {
    public static /* synthetic */ int a(Integer num, Integer num2) {
        return Integer.bitCount(num2.intValue()) - Integer.bitCount(num.intValue());
    }

    public static ak.n0<Integer> b(List<AudioDescriptor> list) {
        if (Build.VERSION.SDK_INT < 34 || list == null) {
            return ak.n0.C();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<AudioDescriptor> it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorA = e.a(it.next());
            if (audioDescriptorA.getStandard() == 2) {
                byte[] descriptor = audioDescriptorA.getDescriptor();
                if (descriptor.length != 3) {
                    w7.t.h("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                } else {
                    arrayList.add(Integer.valueOf(d(descriptor)));
                }
            }
        }
        arrayList.sort(new Comparator() { // from class: c8.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return h.a((Integer) obj, (Integer) obj2);
            }
        });
        return ak.n0.v(arrayList);
    }

    public static ak.n0<Integer> c(List<AudioDescriptor> list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            return ak.n0.C();
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(new g()).reversed());
        Iterator<AudioDescriptor> it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorA = e.a(it.next());
            if (audioDescriptorA.getStandard() == 1) {
                byte[] descriptor = audioDescriptorA.getDescriptor();
                if (descriptor.length != 3) {
                    w7.t.h("AudioDescriptorUtil", "Invalid SAD length: " + descriptor.length);
                } else {
                    byte b15 = descriptor[0];
                    int i15 = (b15 & 7) + 1;
                    if (((b15 >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(w7.o0.L(i15)));
                    }
                }
            }
        }
        return ak.n0.v(treeSet);
    }

    static int d(byte[] bArr) {
        int i15 = 0;
        if (Build.VERSION.SDK_INT >= 34 && bArr.length == 3) {
            byte b15 = bArr[0];
            i15 = (b15 & 1) != 0 ? 12 : 0;
            if ((b15 & 2) != 0) {
                i15 |= 32;
            }
            if ((b15 & 4) != 0) {
                i15 |= 16;
            }
            if ((b15 & 8) != 0) {
                i15 |= 192;
            }
            if ((b15 & 16) != 0) {
                i15 |= 1024;
            }
            if ((b15 & 32) != 0) {
                i15 |= 768;
            }
            if ((b15 & 128) != 0) {
                i15 |= 201326592;
            }
            byte b16 = bArr[1];
            if ((b16 & 1) != 0) {
                i15 |= 81920;
            }
            if ((b16 & 2) != 0) {
                i15 |= PKIFailureInfo.certRevoked;
            }
            if ((b16 & 4) != 0) {
                i15 |= 32768;
            }
            if ((b16 & 8) != 0) {
                i15 |= 6144;
            }
            if ((b16 & 16) != 0) {
                i15 |= 33554432;
            }
            if ((b16 & 32) != 0) {
                i15 |= PKIFailureInfo.transactionIdInUse;
            }
            if ((b16 & 64) != 0) {
                i15 |= 6144;
            }
            if ((b16 & 128) != 0) {
                i15 |= 3145728;
            }
            byte b17 = bArr[2];
            if ((b17 & 1) != 0) {
                i15 |= 655360;
            }
            if ((b17 & 2) != 0) {
                i15 |= 8388608;
            }
            if ((b17 & 4) != 0) {
                return 20971520 | i15;
            }
        }
        return i15;
    }
}
