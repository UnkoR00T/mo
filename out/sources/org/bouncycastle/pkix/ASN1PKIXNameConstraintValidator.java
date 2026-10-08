package org.bouncycastle.pkix;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.IETFUtils;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.NameConstraintValidator;
import org.bouncycastle.asn1.x509.NameConstraintValidatorException;
import org.bouncycastle.asn1.x509.OtherName;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes5.dex */
class ASN1PKIXNameConstraintValidator implements NameConstraintValidator {
    private Set permittedSubtreesDN;
    private Set permittedSubtreesDNS;
    private Set permittedSubtreesEmail;
    private Set permittedSubtreesIP;
    private Set permittedSubtreesOtherName;
    private Set permittedSubtreesURI;
    private Set excludedSubtreesDN = new HashSet();
    private Set excludedSubtreesDNS = new HashSet();
    private Set excludedSubtreesEmail = new HashSet();
    private Set excludedSubtreesURI = new HashSet();
    private Set excludedSubtreesIP = new HashSet();
    private Set excludedSubtreesOtherName = new HashSet();

    private final void addLine(StringBuilder sb5, String str) {
        sb5.append(str);
        sb5.append(Strings.lineSeparator());
    }

    private void checkExcludedDN(Set set, ASN1Sequence aSN1Sequence) throws NameConstraintValidatorException {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (withinDNSubtree(aSN1Sequence, (ASN1Sequence) it.next())) {
                throw new NameConstraintValidatorException("Subject distinguished name is from an excluded subtree");
            }
        }
    }

    private void checkExcludedDNS(Set set, String str) throws NameConstraintValidatorException {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (withinDomain(str, str2) || str.equalsIgnoreCase(str2)) {
                throw new NameConstraintValidatorException("DNS is from an excluded subtree.");
            }
        }
    }

    private void checkExcludedEmail(Set set, String str) throws NameConstraintValidatorException {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (emailIsConstrained(str, (String) it.next())) {
                throw new NameConstraintValidatorException("Email address is from an excluded subtree.");
            }
        }
    }

    private void checkExcludedIP(Set set, byte[] bArr) throws NameConstraintValidatorException {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (isIPConstrained(bArr, (byte[]) it.next())) {
                throw new NameConstraintValidatorException("IP is from an excluded subtree.");
            }
        }
    }

    private void checkExcludedOtherName(Set set, OtherName otherName) throws NameConstraintValidatorException {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (otherNameIsConstrained(otherName, OtherName.getInstance(it.next()))) {
                throw new NameConstraintValidatorException("OtherName is from an excluded subtree.");
            }
        }
    }

    private void checkExcludedURI(Set set, String str) throws NameConstraintValidatorException {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (isUriConstrained(str, (String) it.next())) {
                throw new NameConstraintValidatorException("URI is from an excluded subtree.");
            }
        }
    }

    private void checkPermittedDN(Set set, ASN1Sequence aSN1Sequence) throws NameConstraintValidatorException {
        if (set == null) {
            return;
        }
        if (set.isEmpty() && aSN1Sequence.size() == 0) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (withinDNSubtree(aSN1Sequence, (ASN1Sequence) it.next())) {
                return;
            }
        }
        throw new NameConstraintValidatorException("Subject distinguished name is not from a permitted subtree");
    }

    private void checkPermittedDNS(Set set, String str) throws NameConstraintValidatorException {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (withinDomain(str, str2) || str.equalsIgnoreCase(str2)) {
                return;
            }
        }
        if (str.length() != 0 || set.size() != 0) {
            throw new NameConstraintValidatorException("DNS is not from a permitted subtree.");
        }
    }

    private void checkPermittedEmail(Set set, String str) throws NameConstraintValidatorException {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (emailIsConstrained(str, (String) it.next())) {
                return;
            }
        }
        if (str.length() != 0 || set.size() != 0) {
            throw new NameConstraintValidatorException("Subject email address is not from a permitted subtree.");
        }
    }

    private void checkPermittedIP(Set set, byte[] bArr) throws NameConstraintValidatorException {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (isIPConstrained(bArr, (byte[]) it.next())) {
                return;
            }
        }
        if (bArr.length != 0 || set.size() != 0) {
            throw new NameConstraintValidatorException("IP is not from a permitted subtree.");
        }
    }

    private void checkPermittedOtherName(Set set, OtherName otherName) throws NameConstraintValidatorException {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (otherNameIsConstrained(otherName, (OtherName) it.next())) {
                return;
            }
        }
        throw new NameConstraintValidatorException("Subject OtherName is not from a permitted subtree.");
    }

    private void checkPermittedURI(Set set, String str) throws NameConstraintValidatorException {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (isUriConstrained(str, (String) it.next())) {
                return;
            }
        }
        if (str.length() != 0 || set.size() != 0) {
            throw new NameConstraintValidatorException("URI is not from a permitted subtree.");
        }
    }

    private boolean collectionsAreEqual(Collection collection, Collection collection2) {
        if (collection == collection2) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        for (Object obj : collection) {
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                if (equals(obj, it.next())) {
                }
            }
            return false;
        }
        return true;
    }

    private static int compareTo(byte[] bArr, byte[] bArr2) {
        if (Arrays.areEqual(bArr, bArr2)) {
            return 0;
        }
        return Arrays.areEqual(max(bArr, bArr2), bArr) ? 1 : -1;
    }

    private boolean emailIsConstrained(String str, String str2) {
        String strSubstring = str.substring(str.indexOf(64) + 1);
        if (str2.indexOf(64) != -1) {
            if (str.equalsIgnoreCase(str2) || strSubstring.equalsIgnoreCase(str2.substring(1))) {
                return true;
            }
        } else if (str2.charAt(0) != '.') {
            if (strSubstring.equalsIgnoreCase(str2)) {
                return true;
            }
        } else if (withinDomain(strSubstring, str2)) {
            return true;
        }
        return false;
    }

    private static String extractHostFromURL(String str) {
        String strSubstring = str.substring(str.indexOf(58) + 1);
        if (strSubstring.indexOf("//") != -1) {
            strSubstring = strSubstring.substring(strSubstring.indexOf("//") + 2);
        }
        if (strSubstring.lastIndexOf(58) != -1) {
            strSubstring = strSubstring.substring(0, strSubstring.lastIndexOf(58));
        }
        String strSubstring2 = strSubstring.substring(strSubstring.indexOf(58) + 1);
        String strSubstring3 = strSubstring2.substring(strSubstring2.indexOf(64) + 1);
        return strSubstring3.indexOf(47) != -1 ? strSubstring3.substring(0, strSubstring3.indexOf(47)) : strSubstring3;
    }

    private byte[][] extractIPsAndSubnetMasks(byte[] bArr, byte[] bArr2) {
        int length = bArr.length / 2;
        byte[] bArr3 = new byte[length];
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr, length, bArr4, 0, length);
        byte[] bArr5 = new byte[length];
        byte[] bArr6 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, length);
        System.arraycopy(bArr2, length, bArr6, 0, length);
        return new byte[][]{bArr3, bArr4, bArr5, bArr6};
    }

    private String extractNameAsString(GeneralName generalName) {
        return ASN1IA5String.getInstance(generalName.getName()).getString();
    }

    private int hashCollection(Collection collection) {
        int iHashCode = 0;
        if (collection == null) {
            return 0;
        }
        for (Object obj : collection) {
            iHashCode += obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj.hashCode();
        }
        return iHashCode;
    }

    private Set intersectDN(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(((GeneralSubtree) it.next()).getBase().getName().toASN1Primitive());
            if (set != null) {
                Iterator it4 = set.iterator();
                while (it4.hasNext()) {
                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) it4.next();
                    if (withinDNSubtree(aSN1Sequence, aSN1Sequence2)) {
                        hashSet.add(aSN1Sequence);
                    } else if (withinDNSubtree(aSN1Sequence2, aSN1Sequence)) {
                        hashSet.add(aSN1Sequence2);
                    }
                }
            } else if (aSN1Sequence != null) {
                hashSet.add(aSN1Sequence);
            }
        }
        return hashSet;
    }

    private Set intersectDNS(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String strExtractNameAsString = extractNameAsString(((GeneralSubtree) it.next()).getBase());
            if (set != null) {
                Iterator it4 = set.iterator();
                while (it4.hasNext()) {
                    String str = (String) it4.next();
                    if (withinDomain(str, strExtractNameAsString)) {
                        hashSet.add(str);
                    } else if (withinDomain(strExtractNameAsString, str)) {
                        hashSet.add(strExtractNameAsString);
                    }
                }
            } else if (strExtractNameAsString != null) {
                hashSet.add(strExtractNameAsString);
            }
        }
        return hashSet;
    }

    private Set intersectEmail(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String strExtractNameAsString = extractNameAsString(((GeneralSubtree) it.next()).getBase());
            if (set != null) {
                Iterator it4 = set.iterator();
                while (it4.hasNext()) {
                    intersectEmail(strExtractNameAsString, (String) it4.next(), hashSet);
                }
            } else if (strExtractNameAsString != null) {
                hashSet.add(strExtractNameAsString);
            }
        }
        return hashSet;
    }

    private Set intersectIP(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            byte[] octets = ASN1OctetString.getInstance(((GeneralSubtree) it.next()).getBase().getName()).getOctets();
            if (set != null) {
                Iterator it4 = set.iterator();
                while (it4.hasNext()) {
                    hashSet.addAll(intersectIPRange((byte[]) it4.next(), octets));
                }
            } else if (octets != null) {
                hashSet.add(octets);
            }
        }
        return hashSet;
    }

    private Set intersectIPRange(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return Collections.EMPTY_SET;
        }
        byte[][] bArrExtractIPsAndSubnetMasks = extractIPsAndSubnetMasks(bArr, bArr2);
        byte[] bArr3 = bArrExtractIPsAndSubnetMasks[0];
        byte[] bArr4 = bArrExtractIPsAndSubnetMasks[1];
        byte[] bArr5 = bArrExtractIPsAndSubnetMasks[2];
        byte[] bArr6 = bArrExtractIPsAndSubnetMasks[3];
        byte[][] bArrMinMaxIPs = minMaxIPs(bArr3, bArr4, bArr5, bArr6);
        return compareTo(max(bArrMinMaxIPs[0], bArrMinMaxIPs[2]), min(bArrMinMaxIPs[1], bArrMinMaxIPs[3])) == 1 ? Collections.EMPTY_SET : Collections.singleton(ipWithSubnetMask(or(bArrMinMaxIPs[0], bArrMinMaxIPs[2]), or(bArr4, bArr6)));
    }

    private Set intersectOtherName(Set set, Set set2) {
        HashSet hashSet = new HashSet(set);
        hashSet.retainAll(set2);
        return hashSet;
    }

    private Set intersectURI(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String strExtractNameAsString = extractNameAsString(((GeneralSubtree) it.next()).getBase());
            if (set != null) {
                Iterator it4 = set.iterator();
                while (it4.hasNext()) {
                    intersectURI((String) it4.next(), strExtractNameAsString, hashSet);
                }
            } else if (strExtractNameAsString != null) {
                hashSet.add(strExtractNameAsString);
            }
        }
        return hashSet;
    }

    private byte[] ipWithSubnetMask(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length * 2];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, length);
        return bArr3;
    }

    private boolean isIPConstrained(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length / 2) {
            return false;
        }
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, length, bArr3, 0, length);
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        for (int i15 = 0; i15 < length; i15++) {
            bArr4[i15] = (byte) (bArr2[i15] & bArr3[i15]);
            bArr5[i15] = (byte) (bArr[i15] & bArr3[i15]);
        }
        return Arrays.areEqual(bArr4, bArr5);
    }

    private boolean isUriConstrained(String str, String str2) {
        String strExtractHostFromURL = extractHostFromURL(str);
        if (str2.startsWith(".")) {
            return withinDomain(strExtractHostFromURL, str2);
        }
        return strExtractHostFromURL.equalsIgnoreCase(str2);
    }

    private static byte[] max(byte[] bArr, byte[] bArr2) {
        for (int i15 = 0; i15 < bArr.length; i15++) {
            if ((bArr[i15] & 65535) > (65535 & bArr2[i15])) {
                return bArr;
            }
        }
        return bArr2;
    }

    private static byte[] min(byte[] bArr, byte[] bArr2) {
        for (int i15 = 0; i15 < bArr.length; i15++) {
            if ((bArr[i15] & 65535) < (65535 & bArr2[i15])) {
                return bArr;
            }
        }
        return bArr2;
    }

    private byte[][] minMaxIPs(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        byte[] bArr5 = new byte[length];
        byte[] bArr6 = new byte[length];
        byte[] bArr7 = new byte[length];
        byte[] bArr8 = new byte[length];
        for (int i15 = 0; i15 < length; i15++) {
            bArr5[i15] = (byte) (bArr[i15] & bArr2[i15]);
            byte b15 = bArr[i15];
            byte b16 = bArr2[i15];
            bArr6[i15] = (byte) ((b15 & b16) | (~b16));
            bArr7[i15] = (byte) (bArr3[i15] & bArr4[i15]);
            byte b17 = bArr3[i15];
            byte b18 = bArr4[i15];
            bArr8[i15] = (byte) ((b17 & b18) | (~b18));
        }
        return new byte[][]{bArr5, bArr6, bArr7, bArr8};
    }

    private static byte[] or(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i15 = 0; i15 < bArr.length; i15++) {
            bArr3[i15] = (byte) (bArr[i15] | bArr2[i15]);
        }
        return bArr3;
    }

    private boolean otherNameIsConstrained(OtherName otherName, OtherName otherName2) {
        return otherName2.equals(otherName);
    }

    private String stringifyIP(byte[] bArr) {
        StringBuilder sb5 = new StringBuilder();
        for (int i15 = 0; i15 < bArr.length / 2; i15++) {
            if (sb5.length() > 0) {
                sb5.append(".");
            }
            sb5.append(Integer.toString(bArr[i15] & 255));
        }
        sb5.append("/");
        boolean z15 = true;
        for (int length = bArr.length / 2; length < bArr.length; length++) {
            if (z15) {
                z15 = false;
            } else {
                sb5.append(".");
            }
            sb5.append(Integer.toString(bArr[length] & 255));
        }
        return sb5.toString();
    }

    private String stringifyIPCollection(Set set) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("[");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (sb5.length() > 1) {
                sb5.append(",");
            }
            sb5.append(stringifyIP((byte[]) it.next()));
        }
        sb5.append("]");
        return sb5.toString();
    }

    private String stringifyOtherNameCollection(Set set) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("[");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (sb5.length() > 1) {
                sb5.append(",");
            }
            OtherName otherName = OtherName.getInstance(it.next());
            sb5.append(otherName.getTypeID().getId());
            sb5.append(":");
            try {
                sb5.append(Hex.toHexString(otherName.getValue().toASN1Primitive().getEncoded()));
            } catch (IOException e15) {
                sb5.append(e15.toString());
            }
        }
        sb5.append("]");
        return sb5.toString();
    }

    private Set unionDN(Set set, ASN1Sequence aSN1Sequence) {
        if (set.isEmpty()) {
            if (aSN1Sequence == null) {
                return set;
            }
            set.add(aSN1Sequence);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ASN1Sequence aSN1Sequence2 = (ASN1Sequence) it.next();
            if (withinDNSubtree(aSN1Sequence, aSN1Sequence2)) {
                hashSet.add(aSN1Sequence2);
            } else {
                if (!withinDNSubtree(aSN1Sequence2, aSN1Sequence)) {
                    hashSet.add(aSN1Sequence2);
                }
                hashSet.add(aSN1Sequence);
            }
        }
        return hashSet;
    }

    private Set unionDNS(Set set, String str) {
        if (set.isEmpty()) {
            if (str == null) {
                return set;
            }
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!withinDomain(str2, str)) {
                boolean zWithinDomain = withinDomain(str, str2);
                hashSet.add(str2);
                if (zWithinDomain) {
                }
            }
            hashSet.add(str);
        }
        return hashSet;
    }

    private Set unionEmail(Set set, String str) {
        if (set.isEmpty()) {
            if (str == null) {
                return set;
            }
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            unionEmail((String) it.next(), str, hashSet);
        }
        return hashSet;
    }

    private Set unionIP(Set set, byte[] bArr) {
        if (set.isEmpty()) {
            if (bArr == null) {
                return set;
            }
            set.add(bArr);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.addAll(unionIPRange((byte[]) it.next(), bArr));
        }
        return hashSet;
    }

    private Set unionIPRange(byte[] bArr, byte[] bArr2) {
        HashSet hashSet = new HashSet();
        boolean zAreEqual = Arrays.areEqual(bArr, bArr2);
        hashSet.add(bArr);
        if (zAreEqual) {
            return hashSet;
        }
        hashSet.add(bArr2);
        return hashSet;
    }

    private Set unionOtherName(Set set, OtherName otherName) {
        HashSet hashSet = new HashSet(set);
        hashSet.add(otherName);
        return hashSet;
    }

    private Set unionURI(Set set, String str) {
        if (set.isEmpty()) {
            if (str == null) {
                return set;
            }
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            unionURI((String) it.next(), str, hashSet);
        }
        return hashSet;
    }

    private static boolean withinDNSubtree(ASN1Sequence aSN1Sequence, ASN1Sequence aSN1Sequence2) {
        if (aSN1Sequence2.size() < 1 || aSN1Sequence2.size() > aSN1Sequence.size()) {
            return false;
        }
        RDN rdn = RDN.getInstance(aSN1Sequence2.getObjectAt(0));
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i15 >= aSN1Sequence.size()) {
                i15 = i16;
                break;
            }
            if (RDN.getInstance(aSN1Sequence.getObjectAt(i15)).equals(rdn)) {
                break;
            }
            i16 = i15;
            i15++;
        }
        if (aSN1Sequence2.size() > aSN1Sequence.size() - i15) {
            return false;
        }
        for (int i17 = 0; i17 < aSN1Sequence2.size(); i17++) {
            RDN rdn2 = RDN.getInstance(aSN1Sequence2.getObjectAt(i17));
            RDN rdn3 = RDN.getInstance(aSN1Sequence.getObjectAt(i15 + i17));
            if (rdn2.size() != rdn3.size() || !rdn2.getFirst().getType().equals((ASN1Primitive) rdn3.getFirst().getType())) {
                return false;
            }
            if (rdn2.size() == 1 && rdn2.getFirst().getType().equals((ASN1Primitive) RFC4519Style.serialNumber)) {
                if (!rdn3.getFirst().getValue().toString().startsWith(rdn2.getFirst().getValue().toString())) {
                    return false;
                }
            } else if (!IETFUtils.rDNAreEqual(rdn2, rdn3)) {
                return false;
            }
        }
        return true;
    }

    private boolean withinDomain(String str, String str2) {
        if (str2.startsWith(".")) {
            str2 = str2.substring(1);
        }
        String[] strArrSplit = Strings.split(str2, '.');
        String[] strArrSplit2 = Strings.split(str, '.');
        if (strArrSplit2.length <= strArrSplit.length) {
            return false;
        }
        int length = strArrSplit2.length - strArrSplit.length;
        for (int i15 = -1; i15 < strArrSplit.length; i15++) {
            if (i15 == -1) {
                if (strArrSplit2[i15 + length].equals("")) {
                    return false;
                }
            } else if (!strArrSplit[i15].equalsIgnoreCase(strArrSplit2[i15 + length])) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void addExcludedSubtree(GeneralSubtree generalSubtree) {
        GeneralName base = generalSubtree.getBase();
        int tagNo = base.getTagNo();
        if (tagNo == 0) {
            this.excludedSubtreesOtherName = unionOtherName(this.excludedSubtreesOtherName, OtherName.getInstance(base.getName()));
            return;
        }
        if (tagNo == 1) {
            this.excludedSubtreesEmail = unionEmail(this.excludedSubtreesEmail, extractNameAsString(base));
            return;
        }
        if (tagNo == 2) {
            this.excludedSubtreesDNS = unionDNS(this.excludedSubtreesDNS, extractNameAsString(base));
            return;
        }
        if (tagNo == 4) {
            this.excludedSubtreesDN = unionDN(this.excludedSubtreesDN, (ASN1Sequence) base.getName().toASN1Primitive());
            return;
        }
        if (tagNo == 6) {
            this.excludedSubtreesURI = unionURI(this.excludedSubtreesURI, extractNameAsString(base));
        } else {
            if (tagNo == 7) {
                this.excludedSubtreesIP = unionIP(this.excludedSubtreesIP, ASN1OctetString.getInstance(base.getName()).getOctets());
                return;
            }
            throw new IllegalStateException("Unknown tag encountered: " + base.getTagNo());
        }
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void checkExcluded(GeneralName generalName) throws NameConstraintValidatorException {
        int tagNo = generalName.getTagNo();
        if (tagNo == 0) {
            checkExcludedOtherName(this.excludedSubtreesOtherName, OtherName.getInstance(generalName.getName()));
            return;
        }
        if (tagNo == 1) {
            checkExcludedEmail(this.excludedSubtreesEmail, extractNameAsString(generalName));
            return;
        }
        if (tagNo == 2) {
            checkExcludedDNS(this.excludedSubtreesDNS, ASN1IA5String.getInstance(generalName.getName()).getString());
            return;
        }
        if (tagNo == 4) {
            checkExcludedDN(X500Name.getInstance(generalName.getName()));
            return;
        }
        if (tagNo == 6) {
            checkExcludedURI(this.excludedSubtreesURI, ASN1IA5String.getInstance(generalName.getName()).getString());
        } else {
            if (tagNo != 7) {
                return;
            }
            checkExcludedIP(this.excludedSubtreesIP, ASN1OctetString.getInstance(generalName.getName()).getOctets());
        }
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void checkPermitted(GeneralName generalName) throws NameConstraintValidatorException {
        int tagNo = generalName.getTagNo();
        if (tagNo == 0) {
            checkPermittedOtherName(this.permittedSubtreesOtherName, OtherName.getInstance(generalName.getName()));
            return;
        }
        if (tagNo == 1) {
            checkPermittedEmail(this.permittedSubtreesEmail, extractNameAsString(generalName));
            return;
        }
        if (tagNo == 2) {
            checkPermittedDNS(this.permittedSubtreesDNS, ASN1IA5String.getInstance(generalName.getName()).getString());
            return;
        }
        if (tagNo == 4) {
            checkPermittedDN(X500Name.getInstance(generalName.getName()));
            return;
        }
        if (tagNo == 6) {
            checkPermittedURI(this.permittedSubtreesURI, ASN1IA5String.getInstance(generalName.getName()).getString());
        } else {
            if (tagNo != 7) {
                return;
            }
            checkPermittedIP(this.permittedSubtreesIP, ASN1OctetString.getInstance(generalName.getName()).getOctets());
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ASN1PKIXNameConstraintValidator)) {
            return false;
        }
        ASN1PKIXNameConstraintValidator aSN1PKIXNameConstraintValidator = (ASN1PKIXNameConstraintValidator) obj;
        return collectionsAreEqual(aSN1PKIXNameConstraintValidator.excludedSubtreesDN, this.excludedSubtreesDN) && collectionsAreEqual(aSN1PKIXNameConstraintValidator.excludedSubtreesDNS, this.excludedSubtreesDNS) && collectionsAreEqual(aSN1PKIXNameConstraintValidator.excludedSubtreesEmail, this.excludedSubtreesEmail) && collectionsAreEqual(aSN1PKIXNameConstraintValidator.excludedSubtreesIP, this.excludedSubtreesIP) && collectionsAreEqual(aSN1PKIXNameConstraintValidator.excludedSubtreesURI, this.excludedSubtreesURI) && collectionsAreEqual(aSN1PKIXNameConstraintValidator.excludedSubtreesOtherName, this.excludedSubtreesOtherName) && collectionsAreEqual(aSN1PKIXNameConstraintValidator.permittedSubtreesDN, this.permittedSubtreesDN) && collectionsAreEqual(aSN1PKIXNameConstraintValidator.permittedSubtreesDNS, this.permittedSubtreesDNS) && collectionsAreEqual(aSN1PKIXNameConstraintValidator.permittedSubtreesEmail, this.permittedSubtreesEmail) && collectionsAreEqual(aSN1PKIXNameConstraintValidator.permittedSubtreesIP, this.permittedSubtreesIP) && collectionsAreEqual(aSN1PKIXNameConstraintValidator.permittedSubtreesURI, this.permittedSubtreesURI) && collectionsAreEqual(aSN1PKIXNameConstraintValidator.permittedSubtreesOtherName, this.permittedSubtreesOtherName);
    }

    public int hashCode() {
        return hashCollection(this.excludedSubtreesDN) + hashCollection(this.excludedSubtreesDNS) + hashCollection(this.excludedSubtreesEmail) + hashCollection(this.excludedSubtreesIP) + hashCollection(this.excludedSubtreesURI) + hashCollection(this.excludedSubtreesOtherName) + hashCollection(this.permittedSubtreesDN) + hashCollection(this.permittedSubtreesDNS) + hashCollection(this.permittedSubtreesEmail) + hashCollection(this.permittedSubtreesIP) + hashCollection(this.permittedSubtreesURI) + hashCollection(this.permittedSubtreesOtherName);
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void intersectEmptyPermittedSubtree(int i15) {
        if (i15 == 0) {
            this.permittedSubtreesOtherName = new HashSet();
            return;
        }
        if (i15 == 1) {
            this.permittedSubtreesEmail = new HashSet();
            return;
        }
        if (i15 == 2) {
            this.permittedSubtreesDNS = new HashSet();
            return;
        }
        if (i15 == 4) {
            this.permittedSubtreesDN = new HashSet();
            return;
        }
        if (i15 == 6) {
            this.permittedSubtreesURI = new HashSet();
        } else {
            if (i15 == 7) {
                this.permittedSubtreesIP = new HashSet();
                return;
            }
            throw new IllegalStateException("Unknown tag encountered: " + i15);
        }
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void intersectPermittedSubtree(GeneralSubtree generalSubtree) {
        intersectPermittedSubtree(new GeneralSubtree[]{generalSubtree});
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        addLine(sb5, "permitted:");
        if (this.permittedSubtreesDN != null) {
            addLine(sb5, "DN:");
            addLine(sb5, this.permittedSubtreesDN.toString());
        }
        if (this.permittedSubtreesDNS != null) {
            addLine(sb5, "DNS:");
            addLine(sb5, this.permittedSubtreesDNS.toString());
        }
        if (this.permittedSubtreesEmail != null) {
            addLine(sb5, "Email:");
            addLine(sb5, this.permittedSubtreesEmail.toString());
        }
        if (this.permittedSubtreesURI != null) {
            addLine(sb5, "URI:");
            addLine(sb5, this.permittedSubtreesURI.toString());
        }
        if (this.permittedSubtreesIP != null) {
            addLine(sb5, "IP:");
            addLine(sb5, stringifyIPCollection(this.permittedSubtreesIP));
        }
        if (this.permittedSubtreesOtherName != null) {
            addLine(sb5, "OtherName:");
            addLine(sb5, stringifyOtherNameCollection(this.permittedSubtreesOtherName));
        }
        addLine(sb5, "excluded:");
        if (!this.excludedSubtreesDN.isEmpty()) {
            addLine(sb5, "DN:");
            addLine(sb5, this.excludedSubtreesDN.toString());
        }
        if (!this.excludedSubtreesDNS.isEmpty()) {
            addLine(sb5, "DNS:");
            addLine(sb5, this.excludedSubtreesDNS.toString());
        }
        if (!this.excludedSubtreesEmail.isEmpty()) {
            addLine(sb5, "Email:");
            addLine(sb5, this.excludedSubtreesEmail.toString());
        }
        if (!this.excludedSubtreesURI.isEmpty()) {
            addLine(sb5, "URI:");
            addLine(sb5, this.excludedSubtreesURI.toString());
        }
        if (!this.excludedSubtreesIP.isEmpty()) {
            addLine(sb5, "IP:");
            addLine(sb5, stringifyIPCollection(this.excludedSubtreesIP));
        }
        if (!this.excludedSubtreesOtherName.isEmpty()) {
            addLine(sb5, "OtherName:");
            addLine(sb5, stringifyOtherNameCollection(this.excludedSubtreesOtherName));
        }
        return sb5.toString();
    }

    private boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.areEqual((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    private void intersectEmail(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String strSubstring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else if (str2.startsWith(".")) {
                if (withinDomain(strSubstring, str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else {
                if (strSubstring.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            }
        }
        if (!str.startsWith(".")) {
            if (str2.indexOf(64) != -1) {
                if (str2.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str)) {
                    set.add(str2);
                    return;
                }
                return;
            } else if (str2.startsWith(".")) {
                if (withinDomain(str, str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            }
        }
        if (str2.indexOf(64) != -1) {
            if (withinDomain(str2.substring(str.indexOf(64) + 1), str)) {
                set.add(str2);
            }
        } else if (!str2.startsWith(".")) {
            if (withinDomain(str2, str)) {
                set.add(str2);
            }
        } else if (withinDomain(str, str2) || str.equalsIgnoreCase(str2)) {
            set.add(str);
        } else if (withinDomain(str2, str)) {
            set.add(str2);
        }
    }

    private void intersectURI(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String strSubstring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else if (str2.startsWith(".")) {
                if (withinDomain(strSubstring, str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else {
                if (strSubstring.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            }
        }
        if (!str.startsWith(".")) {
            if (str2.indexOf(64) != -1) {
                if (str2.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str)) {
                    set.add(str2);
                    return;
                }
                return;
            } else if (str2.startsWith(".")) {
                if (withinDomain(str, str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            }
        }
        if (str2.indexOf(64) != -1) {
            if (withinDomain(str2.substring(str.indexOf(64) + 1), str)) {
                set.add(str2);
            }
        } else if (!str2.startsWith(".")) {
            if (withinDomain(str2, str)) {
                set.add(str2);
            }
        } else if (withinDomain(str, str2) || str.equalsIgnoreCase(str2)) {
            set.add(str);
        } else if (withinDomain(str2, str)) {
            set.add(str2);
        }
    }

    private void unionEmail(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String strSubstring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                boolean zEqualsIgnoreCase = str.equalsIgnoreCase(str2);
                set.add(str);
                if (zEqualsIgnoreCase) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (str2.startsWith(".")) {
                if (withinDomain(strSubstring, str2)) {
                    set.add(str2);
                    return;
                }
            } else if (strSubstring.equalsIgnoreCase(str2)) {
                set.add(str2);
                return;
            }
        } else {
            if (str.startsWith(".")) {
                if (str2.indexOf(64) != -1) {
                    boolean zWithinDomain = withinDomain(str2.substring(str.indexOf(64) + 1), str);
                    set.add(str);
                    if (zWithinDomain) {
                        return;
                    }
                    set.add(str2);
                    return;
                }
                if (!str2.startsWith(".")) {
                    boolean zWithinDomain2 = withinDomain(str2, str);
                    set.add(str);
                    if (zWithinDomain2) {
                        return;
                    }
                    set.add(str2);
                    return;
                }
                if (withinDomain(str, str2) || str.equalsIgnoreCase(str2)) {
                    set.add(str2);
                    return;
                }
                boolean zWithinDomain3 = withinDomain(str2, str);
                set.add(str);
                if (zWithinDomain3) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (str2.indexOf(64) != -1) {
                boolean zEqualsIgnoreCase2 = str2.substring(str.indexOf(64) + 1).equalsIgnoreCase(str);
                set.add(str);
                if (zEqualsIgnoreCase2) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (!str2.startsWith(".")) {
                boolean zEqualsIgnoreCase3 = str.equalsIgnoreCase(str2);
                set.add(str);
                if (zEqualsIgnoreCase3) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (withinDomain(str, str2)) {
                set.add(str2);
                return;
            }
        }
        set.add(str);
        set.add(str2);
    }

    private void unionURI(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String strSubstring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                boolean zEqualsIgnoreCase = str.equalsIgnoreCase(str2);
                set.add(str);
                if (zEqualsIgnoreCase) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (str2.startsWith(".")) {
                if (withinDomain(strSubstring, str2)) {
                    set.add(str2);
                    return;
                }
            } else if (strSubstring.equalsIgnoreCase(str2)) {
                set.add(str2);
                return;
            }
        } else {
            if (str.startsWith(".")) {
                if (str2.indexOf(64) != -1) {
                    boolean zWithinDomain = withinDomain(str2.substring(str.indexOf(64) + 1), str);
                    set.add(str);
                    if (zWithinDomain) {
                        return;
                    }
                    set.add(str2);
                    return;
                }
                if (!str2.startsWith(".")) {
                    boolean zWithinDomain2 = withinDomain(str2, str);
                    set.add(str);
                    if (zWithinDomain2) {
                        return;
                    }
                    set.add(str2);
                    return;
                }
                if (withinDomain(str, str2) || str.equalsIgnoreCase(str2)) {
                    set.add(str2);
                    return;
                }
                boolean zWithinDomain3 = withinDomain(str2, str);
                set.add(str);
                if (zWithinDomain3) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (str2.indexOf(64) != -1) {
                boolean zEqualsIgnoreCase2 = str2.substring(str.indexOf(64) + 1).equalsIgnoreCase(str);
                set.add(str);
                if (zEqualsIgnoreCase2) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (!str2.startsWith(".")) {
                boolean zEqualsIgnoreCase3 = str.equalsIgnoreCase(str2);
                set.add(str);
                if (zEqualsIgnoreCase3) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (withinDomain(str, str2)) {
                set.add(str2);
                return;
            }
        }
        set.add(str);
        set.add(str2);
    }

    public void checkExcludedDN(X500Name x500Name) throws NameConstraintValidatorException {
        checkExcludedDN(this.excludedSubtreesDN, ASN1Sequence.getInstance(x500Name));
    }

    public void checkPermittedDN(X500Name x500Name) throws NameConstraintValidatorException {
        checkPermittedDN(this.permittedSubtreesDN, ASN1Sequence.getInstance(x500Name.toASN1Primitive()));
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void intersectPermittedSubtree(GeneralSubtree[] generalSubtreeArr) {
        HashMap map = new HashMap();
        for (int i15 = 0; i15 != generalSubtreeArr.length; i15++) {
            GeneralSubtree generalSubtree = generalSubtreeArr[i15];
            Integer numValueOf = Integers.valueOf(generalSubtree.getBase().getTagNo());
            if (map.get(numValueOf) == null) {
                map.put(numValueOf, new HashSet());
            }
            ((Set) map.get(numValueOf)).add(generalSubtree);
        }
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if (iIntValue == 0) {
                this.permittedSubtreesOtherName = intersectOtherName(this.permittedSubtreesOtherName, (Set) entry.getValue());
            } else if (iIntValue == 1) {
                this.permittedSubtreesEmail = intersectEmail(this.permittedSubtreesEmail, (Set) entry.getValue());
            } else if (iIntValue == 2) {
                this.permittedSubtreesDNS = intersectDNS(this.permittedSubtreesDNS, (Set) entry.getValue());
            } else if (iIntValue == 4) {
                this.permittedSubtreesDN = intersectDN(this.permittedSubtreesDN, (Set) entry.getValue());
            } else if (iIntValue == 6) {
                this.permittedSubtreesURI = intersectURI(this.permittedSubtreesURI, (Set) entry.getValue());
            } else {
                if (iIntValue != 7) {
                    throw new IllegalStateException("Unknown tag encountered: " + iIntValue);
                }
                this.permittedSubtreesIP = intersectIP(this.permittedSubtreesIP, (Set) entry.getValue());
            }
        }
    }
}
