/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/mac/Android/AndroidStudioProject/Test/DroidPluginDemo/Libraries/DroidPlugin/src/com/morgoo/droidplugin/pm/IPluginManager.aidl
 */
package com.morgoo.droidplugin.pm;
/**
 * Code by Andy Zhang (zhangyong232@gmail.com) on 2015/2/12.
 */
public interface IPluginManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.morgoo.droidplugin.pm.IPluginManager
{
private static final java.lang.String DESCRIPTOR = "com.morgoo.droidplugin.pm.IPluginManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.morgoo.droidplugin.pm.IPluginManager interface,
 * generating a proxy if needed.
 */
public static com.morgoo.droidplugin.pm.IPluginManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.morgoo.droidplugin.pm.IPluginManager))) {
return ((com.morgoo.droidplugin.pm.IPluginManager)iin);
}
return new com.morgoo.droidplugin.pm.IPluginManager.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_waitForReady:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.waitForReady();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPackageInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.content.pm.PackageInfo _result = this.getPackageInfo(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_isPluginPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isPluginPackage(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getActivityInfo:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
android.content.pm.ActivityInfo _result = this.getActivityInfo(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_resolveIntent:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
android.content.pm.ResolveInfo _result = this.resolveIntent(_arg0, _arg1, _arg2);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_queryIntentActivities:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
java.util.List<android.content.pm.ResolveInfo> _result = this.queryIntentActivities(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_onActivityCreated:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.ActivityInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.pm.ActivityInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onActivityCreated(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getInstalledPackages:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<android.content.pm.PackageInfo> _result = this.getInstalledPackages(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getApplicationInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.content.pm.ApplicationInfo _result = this.getApplicationInfo(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_installPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.installPackage(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_deletePackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.deletePackage(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getReceivers:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.util.List<android.content.pm.ActivityInfo> _result = this.getReceivers(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getReceiverIntentFilter:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.ActivityInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List<android.content.IntentFilter> _result = this.getReceiverIntentFilter(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_selectStubActivityInfo:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.ActivityInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.pm.ActivityInfo _result = this.selectStubActivityInfo(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_selectStubActivityInfoByIntent:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.pm.ActivityInfo _result = this.selectStubActivityInfoByIntent(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getProcessNameByPid:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getProcessNameByPid(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_onActivityDestory:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.ActivityInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.pm.ActivityInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.pm.ActivityInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onActivityDestory(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_reportMyProcessName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.reportMyProcessName(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.morgoo.droidplugin.pm.IPluginManager
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
//for my api

@Override public boolean waitForReady() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_waitForReady, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//////////////////////////////////////
//
//  THIS API FOR PACKAGE MANAGER
//
//////////////////////////////////////

@Override public android.content.pm.PackageInfo getPackageInfo(java.lang.String packageName, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.PackageInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getPackageInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.PackageInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isPluginPackage(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_isPluginPackage, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ActivityInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((className!=null)) {
_data.writeInt(1);
className.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getActivityInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ActivityInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.pm.ResolveInfo resolveIntent(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ResolveInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(resolvedType);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_resolveIntent, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ResolveInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.content.pm.ResolveInfo> queryIntentActivities(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.ResolveInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(resolvedType);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_queryIntentActivities, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.ResolveInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void onActivityCreated(android.content.pm.ActivityInfo stubInfo, android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((stubInfo!=null)) {
_data.writeInt(1);
stubInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((targetInfo!=null)) {
_data.writeInt(1);
targetInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onActivityCreated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.util.List<android.content.pm.PackageInfo> getInstalledPackages(int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.PackageInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getInstalledPackages, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.PackageInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String packageName, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ApplicationInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getApplicationInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ApplicationInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int installPackage(java.lang.String filepath, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(filepath);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_installPackage, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int deletePackage(java.lang.String packageName, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_deletePackage, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.content.pm.ActivityInfo> getReceivers(java.lang.String packageName, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.ActivityInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getReceivers, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.ActivityInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.content.IntentFilter> getReceiverIntentFilter(android.content.pm.ActivityInfo info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.IntentFilter> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getReceiverIntentFilter, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.IntentFilter.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//////////////////////////////////////
//
//  THIS API FOR ACTIVITY MANAGER
//
//////////////////////////////////////

@Override public android.content.pm.ActivityInfo selectStubActivityInfo(android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ActivityInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((targetInfo!=null)) {
_data.writeInt(1);
targetInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_selectStubActivityInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ActivityInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.content.pm.ActivityInfo selectStubActivityInfoByIntent(android.content.Intent targetIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ActivityInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((targetIntent!=null)) {
_data.writeInt(1);
targetIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_selectStubActivityInfoByIntent, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ActivityInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getProcessNameByPid(int pid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(pid);
mRemote.transact(Stub.TRANSACTION_getProcessNameByPid, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void onActivityDestory(android.content.pm.ActivityInfo stubInfo, android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((stubInfo!=null)) {
_data.writeInt(1);
stubInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((targetInfo!=null)) {
_data.writeInt(1);
targetInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onActivityDestory, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void reportMyProcessName(java.lang.String stubProcessName, java.lang.String targetProcessName, java.lang.String targetPkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(stubProcessName);
_data.writeString(targetProcessName);
_data.writeString(targetPkg);
mRemote.transact(Stub.TRANSACTION_reportMyProcessName, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_waitForReady = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getPackageInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_isPluginPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getActivityInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_resolveIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_queryIntentActivities = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onActivityCreated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getInstalledPackages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getApplicationInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_installPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_deletePackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getReceivers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getReceiverIntentFilter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_selectStubActivityInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_selectStubActivityInfoByIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getProcessNameByPid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_onActivityDestory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_reportMyProcessName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
}
//for my api

public boolean waitForReady() throws android.os.RemoteException;
//////////////////////////////////////
//
//  THIS API FOR PACKAGE MANAGER
//
//////////////////////////////////////

public android.content.pm.PackageInfo getPackageInfo(java.lang.String packageName, int flags) throws android.os.RemoteException;
public boolean isPluginPackage(java.lang.String packageName) throws android.os.RemoteException;
public android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException;
public android.content.pm.ResolveInfo resolveIntent(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException;
public java.util.List<android.content.pm.ResolveInfo> queryIntentActivities(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException;
public void onActivityCreated(android.content.pm.ActivityInfo stubInfo, android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException;
public java.util.List<android.content.pm.PackageInfo> getInstalledPackages(int flags) throws android.os.RemoteException;
public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String packageName, int flags) throws android.os.RemoteException;
public int installPackage(java.lang.String filepath, int flags) throws android.os.RemoteException;
public int deletePackage(java.lang.String packageName, int flags) throws android.os.RemoteException;
public java.util.List<android.content.pm.ActivityInfo> getReceivers(java.lang.String packageName, int flags) throws android.os.RemoteException;
public java.util.List<android.content.IntentFilter> getReceiverIntentFilter(android.content.pm.ActivityInfo info) throws android.os.RemoteException;
//////////////////////////////////////
//
//  THIS API FOR ACTIVITY MANAGER
//
//////////////////////////////////////

public android.content.pm.ActivityInfo selectStubActivityInfo(android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException;
public android.content.pm.ActivityInfo selectStubActivityInfoByIntent(android.content.Intent targetIntent) throws android.os.RemoteException;
public java.lang.String getProcessNameByPid(int pid) throws android.os.RemoteException;
public void onActivityDestory(android.content.pm.ActivityInfo stubInfo, android.content.pm.ActivityInfo targetInfo) throws android.os.RemoteException;
public void reportMyProcessName(java.lang.String stubProcessName, java.lang.String targetProcessName, java.lang.String targetPkg) throws android.os.RemoteException;
}
