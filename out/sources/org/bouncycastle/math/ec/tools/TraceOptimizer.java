package org.bouncycastle.math.ec.tools;

import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.TreeSet;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes5.dex */
public class TraceOptimizer {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final SecureRandom R = new SecureRandom();

    private static int calculateTrace(ECFieldElement eCFieldElement) {
        int fieldSize = eCFieldElement.getFieldSize();
        int iNumberOfLeadingZeros = 31 - Integers.numberOfLeadingZeros(fieldSize);
        ECFieldElement eCFieldElementAdd = eCFieldElement;
        int i15 = 1;
        while (iNumberOfLeadingZeros > 0) {
            eCFieldElementAdd = eCFieldElementAdd.squarePow(i15).add(eCFieldElementAdd);
            iNumberOfLeadingZeros--;
            i15 = fieldSize >>> iNumberOfLeadingZeros;
            if ((i15 & 1) != 0) {
                eCFieldElementAdd = eCFieldElementAdd.square().add(eCFieldElement);
            }
        }
        if (eCFieldElementAdd.isZero()) {
            return 0;
        }
        if (eCFieldElementAdd.isOne()) {
            return 1;
        }
        throw new IllegalStateException("Internal error in trace calculation");
    }

    private static List enumToList(Enumeration enumeration) {
        ArrayList arrayList = new ArrayList();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        return arrayList;
    }

    public static void implPrintNonZeroTraceBits(ECCurve eCCurve) {
        PrintStream printStream;
        StringBuilder sb5;
        int fieldSize = eCCurve.getFieldSize();
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < fieldSize; i15++) {
            if ((i15 & 1) != 0 || i15 == 0) {
                if (calculateTrace(eCCurve.fromBigInteger(ONE.shiftLeft(i15))) != 0) {
                    arrayList.add(Integers.valueOf(i15));
                    printStream = System.out;
                    sb5 = new StringBuilder();
                    sb5.append(" ");
                    sb5.append(i15);
                    printStream.print(sb5.toString());
                }
            } else if (arrayList.contains(Integers.valueOf(i15 >>> 1))) {
                arrayList.add(Integers.valueOf(i15));
                printStream = System.out;
                sb5 = new StringBuilder();
                sb5.append(" ");
                sb5.append(i15);
                printStream.print(sb5.toString());
            }
        }
        System.out.println();
        for (int i16 = 0; i16 < 1000; i16++) {
            BigInteger bigInteger = new BigInteger(fieldSize, R);
            int iCalculateTrace = calculateTrace(eCCurve.fromBigInteger(bigInteger));
            int i17 = 0;
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                if (bigInteger.testBit(((Integer) arrayList.get(i18)).intValue())) {
                    i17 ^= 1;
                }
            }
            if (iCalculateTrace != i17) {
                throw new IllegalStateException("Optimized-trace sanity check failed");
            }
        }
    }

    public static void main(String[] strArr) {
        TreeSet<String> treeSet = new TreeSet(enumToList(ECNamedCurveTable.getNames()));
        treeSet.addAll(enumToList(CustomNamedCurves.getNames()));
        for (String str : treeSet) {
            X9ECParametersHolder byNameLazy = CustomNamedCurves.getByNameLazy(str);
            if (byNameLazy == null) {
                byNameLazy = ECNamedCurveTable.getByNameLazy(str);
            }
            if (byNameLazy != null) {
                ECCurve curve = byNameLazy.getCurve();
                if (ECAlgorithms.isF2mCurve(curve)) {
                    System.out.print(str + ":");
                    implPrintNonZeroTraceBits(curve);
                }
            }
        }
    }

    public static void printNonZeroTraceBits(ECCurve eCCurve) {
        if (!ECAlgorithms.isF2mCurve(eCCurve)) {
            throw new IllegalArgumentException("Trace only defined over characteristic-2 fields");
        }
        implPrintNonZeroTraceBits(eCCurve);
    }
}
