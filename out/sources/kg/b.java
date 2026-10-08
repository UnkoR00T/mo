package kg;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            int iDataSize = parcel.dataSize();
            int length = String.valueOf(str).length();
            StringBuilder sb5 = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
            sb5.append(str);
            sb5.append(" Parcel: pos=");
            sb5.append(iDataPosition);
            sb5.append(" size=");
            sb5.append(iDataSize);
            super(sb5.toString());
        }
    }

    public static int A(Parcel parcel, int i15) {
        return (i15 & (-65536)) != -65536 ? (char) (i15 >> 16) : parcel.readInt();
    }

    public static void B(Parcel parcel, int i15) {
        parcel.setDataPosition(parcel.dataPosition() + A(parcel, i15));
    }

    public static int C(Parcel parcel) {
        int iT = t(parcel);
        int iA = A(parcel, iT);
        int iN = n(iT);
        int iDataPosition = parcel.dataPosition();
        if (iN != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iT))), parcel);
        }
        int i15 = iA + iDataPosition;
        if (i15 >= iDataPosition && i15 <= parcel.dataSize()) {
            return i15;
        }
        StringBuilder sb5 = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i15).length());
        sb5.append("Size read is invalid start=");
        sb5.append(iDataPosition);
        sb5.append(" end=");
        sb5.append(i15);
        throw new a(sb5.toString(), parcel);
    }

    private static void D(Parcel parcel, int i15, int i16) {
        int iA = A(parcel, i15);
        if (iA == i16) {
            return;
        }
        String hexString = Integer.toHexString(iA);
        int length = String.valueOf(i16).length();
        StringBuilder sb5 = new StringBuilder(length + 19 + String.valueOf(iA).length() + 4 + String.valueOf(hexString).length() + 1);
        sb5.append("Expected size ");
        sb5.append(i16);
        sb5.append(" got ");
        sb5.append(iA);
        sb5.append(" (0x");
        sb5.append(hexString);
        sb5.append(")");
        throw new a(sb5.toString(), parcel);
    }

    private static void E(Parcel parcel, int i15, int i16, int i17) {
        if (i16 == i17) {
            return;
        }
        String hexString = Integer.toHexString(i16);
        int length = String.valueOf(i17).length();
        StringBuilder sb5 = new StringBuilder(length + 19 + String.valueOf(i16).length() + 4 + String.valueOf(hexString).length() + 1);
        sb5.append("Expected size ");
        sb5.append(i17);
        sb5.append(" got ");
        sb5.append(i16);
        sb5.append(" (0x");
        sb5.append(hexString);
        sb5.append(")");
        throw new a(sb5.toString(), parcel);
    }

    public static Bundle a(Parcel parcel, int i15) {
        int iA = A(parcel, i15);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iA);
        return bundle;
    }

    public static byte[] b(Parcel parcel, int i15) {
        int iA = A(parcel, i15);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iA);
        return bArrCreateByteArray;
    }

    public static byte[][] c(Parcel parcel, int i15) {
        int iA = A(parcel, i15);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        int i16 = parcel.readInt();
        byte[][] bArr = new byte[i16][];
        for (int i17 = 0; i17 < i16; i17++) {
            bArr[i17] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iA);
        return bArr;
    }

    public static float[] d(Parcel parcel, int i15) {
        int iA = A(parcel, i15);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(iDataPosition + iA);
        return fArrCreateFloatArray;
    }

    public static int[] e(Parcel parcel, int i15) {
        int iA = A(parcel, i15);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iA);
        return iArrCreateIntArray;
    }

    public static ArrayList<Integer> f(Parcel parcel, int i15) {
        int iA = A(parcel, i15);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i16 = parcel.readInt();
        for (int i17 = 0; i17 < i16; i17++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iA);
        return arrayList;
    }

    public static <T extends Parcelable> T g(Parcel parcel, int i15, Parcelable.Creator<T> creator) {
        int iA = A(parcel, i15);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iA);
        return tCreateFromParcel;
    }

    public static String h(Parcel parcel, int i15) {
        int iA = A(parcel, i15);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iA);
        return string;
    }

    public static String[] i(Parcel parcel, int i15) {
        int iA = A(parcel, i15);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iA);
        return strArrCreateStringArray;
    }

    public static ArrayList<String> j(Parcel parcel, int i15) {
        int iA = A(parcel, i15);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iA);
        return arrayListCreateStringArrayList;
    }

    public static <T> T[] k(Parcel parcel, int i15, Parcelable.Creator<T> creator) {
        int iA = A(parcel, i15);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iA);
        return tArr;
    }

    public static <T> ArrayList<T> l(Parcel parcel, int i15, Parcelable.Creator<T> creator) {
        int iA = A(parcel, i15);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iA);
        return arrayListCreateTypedArrayList;
    }

    public static void m(Parcel parcel, int i15) {
        if (parcel.dataPosition() == i15) {
            return;
        }
        StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 26);
        sb5.append("Overread allowed size end=");
        sb5.append(i15);
        throw new a(sb5.toString(), parcel);
    }

    public static int n(int i15) {
        return (char) i15;
    }

    public static boolean o(Parcel parcel, int i15) {
        D(parcel, i15, 4);
        return parcel.readInt() != 0;
    }

    public static byte p(Parcel parcel, int i15) {
        D(parcel, i15, 4);
        return (byte) parcel.readInt();
    }

    public static double q(Parcel parcel, int i15) {
        D(parcel, i15, 8);
        return parcel.readDouble();
    }

    public static float r(Parcel parcel, int i15) {
        D(parcel, i15, 4);
        return parcel.readFloat();
    }

    public static Float s(Parcel parcel, int i15) {
        int iA = A(parcel, i15);
        if (iA == 0) {
            return null;
        }
        E(parcel, i15, iA, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int t(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder u(Parcel parcel, int i15) {
        int iA = A(parcel, i15);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iA);
        return strongBinder;
    }

    public static int v(Parcel parcel, int i15) {
        D(parcel, i15, 4);
        return parcel.readInt();
    }

    public static Integer w(Parcel parcel, int i15) {
        int iA = A(parcel, i15);
        if (iA == 0) {
            return null;
        }
        E(parcel, i15, iA, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static void x(Parcel parcel, int i15, List list, ClassLoader classLoader) {
        int iA = A(parcel, i15);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(iDataPosition + iA);
    }

    public static long y(Parcel parcel, int i15) {
        D(parcel, i15, 8);
        return parcel.readLong();
    }

    public static Long z(Parcel parcel, int i15) {
        int iA = A(parcel, i15);
        if (iA == 0) {
            return null;
        }
        E(parcel, i15, iA, 8);
        return Long.valueOf(parcel.readLong());
    }
}
