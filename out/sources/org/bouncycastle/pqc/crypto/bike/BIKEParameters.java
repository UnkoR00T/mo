package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.pqc.crypto.KEMParameters;

/* JADX INFO: loaded from: classes5.dex */
public class BIKEParameters implements KEMParameters {
    public static final BIKEParameters bike128 = new BIKEParameters("bike128", 12323, 142, 134, 256, 5, 3, 128);
    public static final BIKEParameters bike192 = new BIKEParameters("bike192", 24659, 206, 199, 256, 5, 3, 192);
    public static final BIKEParameters bike256 = new BIKEParameters("bike256", 40973, 274, 264, 256, 5, 3, 256);
    private BIKEEngine bikeEngine;
    private final int defaultKeySize;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f149430l;
    private String name;
    private int nbIter;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f149431r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f149432t;
    private int tau;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f149433w;

    private BIKEParameters(String str, int i15, int i16, int i17, int i18, int i19, int i25, int i26) {
        this.name = str;
        this.f149431r = i15;
        this.f149433w = i16;
        this.f149432t = i17;
        this.f149430l = i18;
        this.nbIter = i19;
        this.tau = i25;
        this.defaultKeySize = i26;
        this.bikeEngine = new BIKEEngine(i15, i16, i17, i18, i19, i25);
    }

    BIKEEngine getEngine() {
        return this.bikeEngine;
    }

    public int getL() {
        return this.f149430l;
    }

    public int getLByte() {
        return this.f149430l / 8;
    }

    public String getName() {
        return this.name;
    }

    public int getNbIter() {
        return this.nbIter;
    }

    public int getR() {
        return this.f149431r;
    }

    public int getRByte() {
        return (this.f149431r + 7) / 8;
    }

    public int getSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getT() {
        return this.f149432t;
    }

    public int getTau() {
        return this.tau;
    }

    public int getW() {
        return this.f149433w;
    }
}
